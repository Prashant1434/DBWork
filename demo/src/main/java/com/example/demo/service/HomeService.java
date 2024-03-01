package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dao.GitHubResponseDao;
import com.example.demo.model.GitHubResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HomeService {

	
	@Autowired
	private GitHubResponseDao dao;
	
	public String callingGraphQL() {

		String query = "{" + "  user(login: \"Prashant1434\") {" + "    name email"

				+ "    contributionsCollection(from: \"2023-01-01T00:00:00Z\", to: \"2023-12-31T23:59:59Z\") {"
				+ "    startedAt" + "    endedAt" + "      contributionCalendar {" + "        totalContributions"
				+ "      }" + "    }" + "  }" + "}";

		String requestBody = "{\"query\":\"" + query.replace("\"", "\\\"") + "\"}";

		WebClient client = WebClient.builder().defaultHeader(org.springframework.http.HttpHeaders.AUTHORIZATION,
				"Bearer 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").baseUrl("https://api.github.com").build();

		String response = client.post().uri("/graphql").contentType(org.springframework.http.MediaType.APPLICATION_JSON)
				.bodyValue(requestBody).retrieve().bodyToMono(String.class).block();
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			GitHubResponse gitHubResponse = mapper.readValue(response, GitHubResponse.class);
			dao.save(gitHubResponse);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return response;
	}

}

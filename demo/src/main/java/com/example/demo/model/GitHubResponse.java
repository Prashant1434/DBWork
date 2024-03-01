package com.example.demo.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class GitHubResponse {
	@Id
	@GeneratedValue
	private Integer id;
	@Embedded
	private Data data;

	public GitHubResponse() {
	}

	public GitHubResponse(Integer id, Data data) {
		this.id = id;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}

package com.example.demo.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class User {
	private String name;
	private String email;
	@Embedded
	private ContributionsCollection contributionsCollection;

	public User() {
	}

	public User(String name, String email, ContributionsCollection contributionsCollection) {
		super();
		this.name = name;
		this.email = email;
		this.contributionsCollection = contributionsCollection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContributionsCollection getContributionsCollection() {
		return contributionsCollection;
	}

	public void setContributionsCollection(ContributionsCollection contributionsCollection) {
		this.contributionsCollection = contributionsCollection;
	}

}

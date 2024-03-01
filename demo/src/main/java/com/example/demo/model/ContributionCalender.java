package com.example.demo.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ContributionCalender {
	private Long totalContributions;

	public ContributionCalender() {
		super();
	}

	public ContributionCalender(Long totalContributions) {
		super();
		this.totalContributions = totalContributions;
	}

	public Long getTotalContributions() {
		return totalContributions;
	}

	public void setTotalContributions(Long totalContributions) {
		this.totalContributions = totalContributions;
	}

}

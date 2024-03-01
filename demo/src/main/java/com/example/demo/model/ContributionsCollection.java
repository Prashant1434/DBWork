package com.example.demo.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class ContributionsCollection {
	private String startedAt;
	private String endedAt;
	@Embedded
	private ContributionCalender contributionCalendar;

	public ContributionsCollection() {
	}

	public ContributionsCollection(String startedAt, String endedAt, ContributionCalender contributionCalendar) {
		super();
		this.startedAt = startedAt;
		this.endedAt = endedAt;
		this.contributionCalendar = contributionCalendar;
	}

	public String getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}

	public String getEndedAt() {
		return endedAt;
	}

	public void setEndedAt(String endedAt) {
		this.endedAt = endedAt;
	}

	public ContributionCalender getContributionCalendar() {
		return contributionCalendar;
	}

	public void setContributionCalendar(ContributionCalender contributionCalendar) {
		this.contributionCalendar = contributionCalendar;
	}

}

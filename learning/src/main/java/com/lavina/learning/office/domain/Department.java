package com.lavina.learning.office.domain;

import java.util.List;

public class Department {
	String name;
	int id;
	List<Team> teams;
	
	public Department() {
		super();
	}

	public Department(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Department(String name, int id, List<Team> teams) {
		super();
		this.name = name;
		this.id = id;
		this.teams = teams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public String toString() {
		return "Department name=" + name + "\n" 
				+ ", id=" + id + "\n" 
				+ ", teams=" + teams  ;
	}
	
}

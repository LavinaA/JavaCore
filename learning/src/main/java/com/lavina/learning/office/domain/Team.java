package com.lavina.learning.office.domain;

import java.util.List;

public class Team {
	String name;
	int id;
	List<Employee> emp;
	
	public Team() {
		super();
	}

	public Team(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Team(String name, int id, List<Employee> emp) {
		super();
		this.name = name;
		this.id = id;
		this.emp = emp;
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

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public String toString() {
		return "Team name=" + name +"\n"
				+ "id=" + id +"\n"
				+ "emp=" + emp ;
	}
	
	
}

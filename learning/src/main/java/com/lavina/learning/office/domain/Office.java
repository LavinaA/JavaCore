package com.lavina.learning.office.domain;

import java.util.List;

public class Office {
	String name;
	int id;
	Address officeAddress;
	List<Department> depts ;
	
	public Office(){
		
	}
	
	public Office(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Office(String name, int id, Address officeAddress, List<Department> depts) {
		super();
		this.name = name;
		this.id = id;
		this.officeAddress = officeAddress;
		this.depts = depts;
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

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public List<Department> getDepts() {
		return depts;
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}

	public String toString() {
		return "Office name=" + name + "\n"
				+ "id=" + id + "\n"
				+ "officeAddress=" + officeAddress + "\n"
				+ "depts=" + depts ;
	}
	
}
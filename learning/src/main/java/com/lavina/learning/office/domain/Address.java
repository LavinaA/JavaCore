package com.lavina.learning.office.domain;

public class Address { 
	private String buildingNo;
	private String streetNo;
	private String city;
	private String state;
	
	public Address() {
		
	}
	public Address(String buildingNo, String streetNo, String city, String state) {
		this.buildingNo = buildingNo;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
	}
	
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Building No - " + buildingNo + ","
			   +"Street Number - " + streetNo + "," 
			   +"City - " + city + ","
			   +"State - " + state
				;
	}
}

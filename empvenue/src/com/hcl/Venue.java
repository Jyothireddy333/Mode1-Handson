package com.hcl;

public class Venue extends Main {
	String name;
	String city;
	private Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getCity() {
		return city;
	}
	private void setCity(String city) {
		this.city = city;
	}
	

}

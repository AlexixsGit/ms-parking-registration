package com.parking.registration.model;

public class Vehicle {

	private String plaque;
	private String type;

	public Vehicle(String plaque, String type) {
		this.plaque = plaque;
		this.type = type;
	}

	public Vehicle() {
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

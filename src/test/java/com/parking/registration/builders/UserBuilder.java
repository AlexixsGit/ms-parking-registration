package com.parking.registration.builders;

import static com.parking.registration.builders.CardBuilder.aCard;
import static com.parking.registration.builders.VehicleBuilder.aVehicle;

import com.parking.registration.model.Card;
import com.parking.registration.model.User;
import com.parking.registration.model.Vehicle;

public class UserBuilder {

	private String userName;
	private String name;
	private String lastName;
	private String address;
	private String phone;
	private String email;
	private Card card;
	private Vehicle vehicle;

	public UserBuilder() {
		this.userName = "Alexis";
		this.name = "Edward";
		this.lastName = "Ortiz";
		this.address = "Street 45 south";
		this.phone = "3939393";
		this.email = "e.du1991@hotmail.com";
		this.card = aCard().build();
		this.vehicle = aVehicle().build();
	}

	public UserBuilder withUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public UserBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public UserBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder withAddress(String address) {
		this.address = address;
		return this;
	}

	public UserBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder withCard(Card card) {
		this.card = card;
		return this;
	}

	public UserBuilder withVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		return this;
	}

	public static UserBuilder aUser() {
		return new UserBuilder();
	}

	public User build() {
		return new User(this.address, this.card, this.email, this.lastName, this.name, this.phone, this.userName,
				this.vehicle);
	}
}

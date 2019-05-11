package com.parking.registration.model;

public class RegistrationRequest {

	private User user;

	public RegistrationRequest(User user) {
		this.setUser(user);
	}

	public RegistrationRequest() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

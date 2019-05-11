package com.parking.registration.builders;

import static com.parking.registration.builders.UserBuilder.aUser;

import com.parking.registration.model.RegistrationRequest;
import com.parking.registration.model.User;

public class RegistrationRequestBuilder {

	private User user;

	public RegistrationRequestBuilder() {
		this.user = aUser().build();
	}

	public RegistrationRequestBuilder aRegistrationRequest() {
		return new RegistrationRequestBuilder();
	}

	public RegistrationRequest build() {
		return new RegistrationRequest(this.user);
	}
}

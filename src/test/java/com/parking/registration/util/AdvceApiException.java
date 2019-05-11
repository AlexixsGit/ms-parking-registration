package com.parking.registration.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdvceApiException {

	@ExceptionHandler(ApiException.class)
	public final ResponseEntity<Object> handleApiException(ApiException ex) {
		return new ResponseEntity<Object>(
				Util.buildError(ex.getId(), String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()),
						HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
						String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()), ex.getSource(), ex.getDetail()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

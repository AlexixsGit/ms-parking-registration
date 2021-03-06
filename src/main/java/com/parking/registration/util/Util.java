package com.parking.registration.util;

import com.parking.registration.jsonapi.ErrorDetail;
import com.parking.registration.jsonapi.JsonApiError;

public class Util {

	/**
	 * Method to build an error response
	 * 
	 * @param id
	 * @param code
	 * @param title
	 * @param status
	 * @param source
	 * @return
	 */
	public static JsonApiError buildError(String id, String code, String title, String status, String source,
			String detail) {
		ErrorDetail errorDetail = new ErrorDetail(code, id, source, status, title, detail);
		JsonApiError errors = new JsonApiError();
		errors.addErrorDetail(errorDetail);
		return errors;
	}

}

package com.simpleRestfulWebServices.foodservices.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FoodItemNotFoundException extends RuntimeException {
	
	public FoodItemNotFoundException(String message) {
		super(message);
	}
}

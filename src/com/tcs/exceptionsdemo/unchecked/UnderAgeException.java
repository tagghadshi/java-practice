package com.tcs.exceptionsdemo.unchecked;

public class UnderAgeException extends RuntimeException {
	public UnderAgeException(String message) {
		super(message);
	}
}

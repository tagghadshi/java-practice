package com.tcs.exceptionsdemo.unchecked;

public class OverAgeException extends RuntimeException {
	public OverAgeException(String message) {
		super(message);
	}
}

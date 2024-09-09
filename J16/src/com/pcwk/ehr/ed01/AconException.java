package com.pcwk.ehr.ed01;

public class AconException extends Exception {

	public AconException(String message) {
		super(message);
		System.out.println("*AconException*");
	}
}

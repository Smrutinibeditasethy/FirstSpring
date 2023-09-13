package com.mavenexample.FirstSpring;

public class UPI implements Payment{

	@Override
	public String pay() {
		return "Payment done through UPI";
	}

}

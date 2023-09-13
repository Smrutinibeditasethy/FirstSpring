package com.mavenexample.FirstSpring;

public class CreditCard implements Payment {

	@Override
	public String pay() {
		return "Payment done through credit card";
	}

}

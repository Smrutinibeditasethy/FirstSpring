package com.mavenexample.FirstSpring;

public class DebitCard implements Payment{

	@Override
	public String pay() {
		return "Payment done through Debit card";
	}

}

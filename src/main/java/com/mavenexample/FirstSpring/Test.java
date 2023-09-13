package com.mavenexample.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	BillCollector bc=context.getBean("bc",BillCollector.class);
	bc.bill();
}
}

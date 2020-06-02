package com.transport.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//annotation based context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer = context.getBean(Customer.class);
		customer.TransportType();
		context.close();
	}

}

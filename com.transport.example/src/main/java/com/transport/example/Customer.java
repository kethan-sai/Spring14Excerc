package com.transport.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {

	Transportation transport;
	
	//construction based DI
	@Autowired
	public Customer(Transportation transp) {
		this.transport = transp;
	}
	
	public void TransportType() {
		transport.TransportType();
	}
}

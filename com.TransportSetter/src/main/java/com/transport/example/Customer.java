package com.transport.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {

	Transportation transport;
	
	//setter based DI
	@Autowired
	public void setTransport(Transportation transp) {
		this.transport = transp;
	}
	
	public void TransportType() {
		transport.TransportType();
	}
}

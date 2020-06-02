package com.transport.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Customer {
	//Field based DI
	@Autowired
	Transportation transport;
	
	
	public void TransportType() {
		transport.TransportType();
	}
}

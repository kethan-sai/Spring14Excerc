package com.transport.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.transport.example")
public class AppConfig {
	//wiring beans for components
@Bean
public Transportation getTransportation() {
	return new TransportationImpl();
}
}

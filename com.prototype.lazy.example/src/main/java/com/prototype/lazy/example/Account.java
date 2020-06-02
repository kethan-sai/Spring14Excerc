package com.prototype.lazy.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Account {

	String accountholder;
	
	String getAccountHolder() {
		return accountholder;
	}
	
	void setAccountHolder(String accountholder) {
		this.accountholder = accountholder;
	}
	//init function to assign deafult value
	@PostConstruct
	public void init() {
		this.accountholder = "froyd";
		System.out.println("Init: "+ accountholder);
	}
	
	//destroyer
	@PreDestroy
	public void destroy() {
		this.accountholder= "";
		System.out.println("Destroyed: "+ accountholder);
	}
}

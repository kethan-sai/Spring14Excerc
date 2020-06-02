package com.prototype.lazy.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//context creation and class calling
		Account sr1 = context.getBean("account", Account.class);
		sr1.setAccountHolder("KElly");
		System.out.println(sr1.getAccountHolder());
		
		Account sr2 = context.getBean("account", Account.class);
		sr2.setAccountHolder("Maxwell");
		System.out.println(sr2.getAccountHolder());
		
		context.close();
	}

}

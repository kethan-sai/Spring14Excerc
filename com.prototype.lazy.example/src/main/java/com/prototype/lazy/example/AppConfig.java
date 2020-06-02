package com.prototype.lazy.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

//scan package for beans and set scope as prototype with lazy configuration
@Configuration
@ComponentScan(basePackages = "com.prototype.lazy.example")
@Lazy
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AppConfig {

	public Account getAccount() {
		return new Account();
	}
}

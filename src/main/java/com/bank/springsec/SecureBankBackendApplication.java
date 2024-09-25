package com.bank.springsec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.bank.springsec.controller")
public class SecureBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureBankBackendApplication.class, args);
	}

}

package com.atsistemas.cygnus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty("spring.jackson.serialization.INDENT_OUTPUT", "true");
		SpringApplication.run(Application.class, args);
	}
	
}
package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	
	public Application(){
		super();
		setRegisterErrorPageFilter(false);
	}
	
	public static void main(String[] args){
		SpringApplication.run(Application.class);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	       return application.sources(Application.class);
	 }
}

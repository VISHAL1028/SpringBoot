package com.venom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VenomApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(VenomApplication.class, args);
		System.out.println("Hello World");
//		Alien obj = new Alien();
//		obj.code();
		Alien obj=context.getBean(Alien.class);
		obj.code();

		Alien obj1=context.getBean(Alien.class);
		obj.code();


	}

}

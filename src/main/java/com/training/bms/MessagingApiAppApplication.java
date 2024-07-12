package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	@GetMapping("enjoyWeekend")
	public String sayHi() {
		return "We are Going on the Vaccation this Weekend";
	}
	
	public static String printGreetings() {
		return "Hi Orcale";
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		System.out.println(printGreetings());
		
		System.out.println("Hello World");
				
	}

}

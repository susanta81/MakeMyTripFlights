package com.suspro.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
public class HelloWorldApplication {

	@GetMapping("/flights")
	public String getHelloFlights() {

		String ip = null;
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		}catch(UnknownHostException ex){
			ex.printStackTrace();
		}
		return "Welcome to Susanta Flight Service V21 : "+ip;
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}

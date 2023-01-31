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
	public String getFlights() throws UnknownHostException {

		String ip = InetAddress.getLocalHost().getHostAddress();
		return "Welcome to Flight Service V2 : "+ip;
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}

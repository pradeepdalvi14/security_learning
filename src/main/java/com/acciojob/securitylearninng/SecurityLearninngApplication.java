package com.acciojob.securitylearninng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityLearninngApplication {

	public static void main(String[] args) {

		String password = "abc";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println(passwordEncoder.encode(password));


		SpringApplication.run(SecurityLearninngApplication.class, args);
	}

}

package com.teamevsolution.auth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class Auth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Auth2ServerApplication.class, args);
	}

}

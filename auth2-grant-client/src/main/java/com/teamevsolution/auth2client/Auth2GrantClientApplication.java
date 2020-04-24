package com.teamevsolution.auth2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class Auth2GrantClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Auth2GrantClientApplication.class, args);
	}

}

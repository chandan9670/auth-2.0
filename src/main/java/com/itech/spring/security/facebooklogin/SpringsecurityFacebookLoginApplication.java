package com.itech.spring.security.facebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.web.servlet.oauth2.client.OAuth2ClientSecurityMarker;

@SpringBootApplication
@OAuth2ClientSecurityMarker
public class SpringsecurityFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityFacebookLoginApplication.class, args);
	}

}

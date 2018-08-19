package com.way2learnonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@SpringBootApplication
@EnableResourceServer
public class OAuth2ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceServerApplication.class, args);
	}
	
/*	
	@Bean
	public ResourceServerTokenServices tokenService() {
	    RemoteTokenServices tokenServices = new RemoteTokenServices();
	    
	    tokenServices.setClientId("my-trusted-client");
	    tokenServices.setClientSecret("secret");
	    tokenServices.setTokenName("tokenName");
	    tokenServices.setCheckTokenEndpointUrl("http://localhost:8081/oauth/check_token");
	    return tokenServices;
	}*/
}

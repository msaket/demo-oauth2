package com.saket.demooauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecOAUTHGitHubConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
	}

	/*
	 * Creating this client registration is not required because we have added client-id and client-secret
	 * in property files. Using that information spring creates the bean by itself.
	 * 
	private ClientRegistration clientRegistration() { 
		 return	 CommonOAuth2Provider.GITHUB.getBuilder("github")
				 .clientId("02ebdbb8f6ef9d8ea746")
				 .clientSecret("9ad5c32c6763088b654eb90592844bccb1546a4a")
				 .build(); 
	}
	 
	@Bean
	public ClientRegistrationRepository clientRepository() {
		ClientRegistration clientReg = clientRegistration();
		return new InMemoryClientRegistrationRepository(clientReg);
	}*/

}

package com.eduit.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Esta clase es para no tener problemas en la integración con el Microservicio
 * @author fmediotte
 *
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}

}

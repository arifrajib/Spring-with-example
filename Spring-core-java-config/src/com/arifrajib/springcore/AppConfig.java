package com.arifrajib.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.arifrajib.springcore.laundry.AbcLaundryService;
import com.arifrajib.springcore.laundry.LaundryService;
import com.arifrajib.springcore.washer.WasherService;
import com.arifrajib.springcore.washer.XyzWasherService;

@Configuration
@ComponentScan("com.arifrajib.springcore.dryer")
@PropertySource("classpath:env.properties")
public class AppConfig {
	
	/*
	 * Bean Configuration for Washer Service
	 */
	@Bean
	public WasherService washerService() {
		return new XyzWasherService();
	}
	
	/*
	 * Bean config for Laundry Service
	 */
	@Bean
	public LaundryService laundry() {
		return new AbcLaundryService(washerService());
	}

}

package com.arifrajib.springcorexml.dryer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MnoDryerService implements DryerService {

	/*
	 * Inject Property Value
	 */
	private String brand;
	
	@Value("${dryer.name}")
	public void setBrand(String name) {
		brand = name;
	}
	
	@Override
	public String Dry() {
		// Dry Method
		return "Using "+brand+" Drying is Done!! Thanks for using Mno service.";
	}

}

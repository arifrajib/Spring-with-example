package com.arifrajib.springcorexml.washer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class XyzWasherService implements WasherService {

	private String brand;

	/*
	 * field Injection
	 */
	@Value("${washer.name}")
	public void setBrand(String name) {
		brand = name;
	}
	
	@Override
	public String wash() {
		// Wash Method
		return "Wish is Done!! using "+brand+", Thanks for using Xyz serivce.";
	}

}

package com.arifrajib.springcorexml.washer;

public class XyzWasherService implements WasherService {

	private String brand;

	/*
	 * field Injection
	 */
	public void setBrand(String name) {
		brand = name;
	}
	
	@Override
	public String wash() {
		// Wash Method
		return "Wish is Done!! using "+brand+", Thanks for using Xyz serivce.";
	}

}

package com.arifrajib.springcorexml.dryer;

public class MnoDryerService implements DryerService {

	/*
	 * Inject Property Value
	 */
	private String brand;
	
	public void setBrand(String name) {
		brand = name;
	}
	
	@Override
	public String Dry() {
		// Dry Method
		return "Using "+brand+" Drying is Done!! Thanks for using Mno service.";
	}

}

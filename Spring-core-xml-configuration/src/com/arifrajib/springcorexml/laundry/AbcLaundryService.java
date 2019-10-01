package com.arifrajib.springcorexml.laundry;

import com.arifrajib.springcorexml.dryer.DryerService;
import com.arifrajib.springcorexml.washer.WasherService;

public class AbcLaundryService implements LaundryService {
	
	private WasherService washer;
	
	private DryerService drayer;
		
	/*
	 * Constructor Injection
	 */
	public AbcLaundryService(WasherService service) {
		washer = service;
	}
	
	/*
	 * Setter Injection
	 */
	public void setDrayerService(DryerService service) {
		drayer = service;
	}

	@Override
	public String doWashing() {
		/*
		 * Return the outsource wash service
		 */
		return washer.wash();
	}

	@Override
	public String doDrying() {
		// Return the outsource Dryer service
		return drayer.Dry();
	}

	/*
	 * Welcome Message, Initialization Callbacks
	 */
	public void welcomeMessage() {
		System.out.println("Welcome to Abc Laundry Service");
	}
	
	/*
	 * Thanks Message, Destruction Callbacks
	 */
	public void thanksMessage() {
		System.out.println("Thanks for using Abc Laundry Service");
	}
}

package com.arifrajib.springcore.laundry;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arifrajib.springcore.dryer.DryerService;
import com.arifrajib.springcore.washer.WasherService;

//@Component("laundry")
public class AbcLaundryService implements LaundryService {
	
	private WasherService washer;
	
	private DryerService drayer;
		
	/*
	 * Constructor Injection
	 */
	//@Autowired
	public AbcLaundryService(WasherService service) {
		washer = service;
	}
	
	/*
	 * Setter Injection
	 */
	@Autowired
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
	@PostConstruct
	public void welcomeMessage() {
		System.out.println("Welcome to Abc Laundry Service");
	}
	
	/*
	 * Thanks Message, Destruction Callbacks
	 */
	@PreDestroy
	public void thanksMessage() {
		System.out.println("Thanks for using Abc Laundry Service");
	}
}

package com.arifrajib.springmvc.model;

public class ContactInformation {
	
	private String firstName;
	private String lastName;
	
	public ContactInformation() {
		firstName = "Default";
		lastName = "Name";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

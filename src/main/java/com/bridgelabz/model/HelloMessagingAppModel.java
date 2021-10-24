package com.bridgelabz.model;

import java.io.Serializable;

public class HelloMessagingAppModel implements Serializable{
	public String firstName;
	public String lastName;
	
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

package com.barapp.bapp.persistence.entities;

import lombok.Data;

@Data
public class Persona {
  public String firstname, lastname;

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}
  
  
}


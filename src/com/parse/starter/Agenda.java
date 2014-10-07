package com.parse.starter;

import com.parse.ParseObject;
import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseUser;

@ParseClassName("Agenda")
public class Agenda extends ParseObject {

	public Agenda() {
		// A default constructor is required.
	}
	
	public String getSession() {
		return getString("session");
	}

	public void setSession(String title) {
		put("session", title);
	}
	
	public String getLocation() {
		return getString("location");
	}

	public void setLocation(String location) {
		put("location", location);
	}
}

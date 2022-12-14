package com.example;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Profile {
	
	@Size(min= 3, max= 20)
	private String forename;
	
	@Size(min= 3, max= 20)
	private String surname;
	
	@Pattern(regexp="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")
	private String dateOfBirth;
	
	@NotNull
	private String gender;
	
	@NotNull
	private String ethnicity;

	@Override
	public String toString() {
		return "profile [forename=" + forename + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", ethnicity=" + ethnicity + "]";
	}
	
	

}

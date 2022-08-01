package com.example.model;

import javax.persistence.GenerationType;

//@Entity
//@Table(name = "Eployees")
public class Employee {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(nullable=false)
	private String firstName;
	
	//@Column(nullable=false)
	private String lastName;
	
	private String dateOfBirth;
	
	//@Column(nullable=false)
	private String dateJoined;
	
	//@Column(nullable=false)
	private String role;
	
	private int departmentName;
	
	private int departmentId;
	
	private String supervisor;
	
	private String currentProject;
	
	//@Column(nullable=false)
	private String workType; //full time or part time
	
	//@Column(nullable=false)
	private double hourlyWage;
	
	private String userName;
	
	private String password;
}

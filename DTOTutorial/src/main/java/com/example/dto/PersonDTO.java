package com.example.dto;

public class PersonDTO {
	private Long id;

	private String name;

	private int age;

	public PersonDTO(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public PersonDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

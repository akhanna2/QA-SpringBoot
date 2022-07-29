package com.example.dto;

public class AccountDTO {
	
	private Long id;
	private String name;
	
	public AccountDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public AccountDTO() {
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
	
}

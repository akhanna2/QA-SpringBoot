package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AccountDTO;
import com.example.model.Account;
import com.example.service.AccountService;

@RestController
public class AccountController {
	
	private AccountService service;

	public AccountController(AccountService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/addAccount")
	public AccountDTO addAccount(@RequestBody Account acc) {
		return this.service.addAccount(acc);
	}
	
	@GetMapping("/allAccounts")
	public List<AccountDTO> getAllAccounts(){
		return this.service.readAccount();
	}
	
	@PutMapping("/updateAccount/{id}")
	public AccountDTO updateAccount(@PathVariable Long id, @RequestBody Account acc) {
		return this.service.updateAccount(id, acc);
	}
	
	@DeleteMapping("/deleteAccount/{id}")
	public boolean deleteAccount(@PathVariable Long id) {
		return this.service.deleteAccount(id);
	}
	
	
}

package com.example.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Band;
import com.example.rest.dto.BandDTO;
import com.example.service.BandService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BandController {
	
	private BandService service;
	
	@PostMapping("/addBand")
	public BandDTO addband(@RequestBody Band band) {
		return service.addBand(band);
	}
	
	@GetMapping("/allBands")
	public List<BandDTO> getAllBands(){
		return service.getAllBands();
	}
	
	@PutMapping("/updateBand/{id}")
	public BandDTO updateBand(@PathVariable Long id, @RequestBody Band band) {
		return service.updateBand(id, band);
	}
	
	@DeleteMapping("/deleteBand/{id}")
	public boolean deleteBand(@PathVariable Long id) {
		return service.deleteBand(id);
	}
	
	@GetMapping("/bandById")
	public BandDTO readBandById(@PathParam("id") Long id) {
		return service.readById(id);
	}
	
	@GetMapping("/bandByName")
	public BandDTO readByName(@PathParam("name") String name){
		return service.readByName(name);
	}

}

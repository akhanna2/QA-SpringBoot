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

import com.example.persistence.domain.Musician;
import com.example.rest.dto.MusicianDTO;
import com.example.service.MusicianService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MusicianController {
	
	private MusicianService service;
	
	@PostMapping("addMusician")
	public MusicianDTO addMusician(@RequestBody Musician musician) {
		return service.addMusician(musician);
	}
	
	@GetMapping("/allMusicians")
	public List<MusicianDTO> getAllMusicians(){
		return service.getAllMusicians();
	}
	
	@PutMapping("/updateMusician/{id}")
	public MusicianDTO updateMusician(@PathVariable Long id, @RequestBody Musician musician) {
		return service.updateMusician(id, musician);
	}
	
	@DeleteMapping("/deleteMusician/{id}")
	public boolean deleteMusician(@PathVariable Long id) {
		return service.deleteMusician(id);
	}
	
	@GetMapping("/musicianById")
	public MusicianDTO readMusicianById(@PathParam("id") Long id) {
		return service.readById(id);
	}
	
	@GetMapping("/musicianByName")
	public List<MusicianDTO> readMusicianByName(@PathParam("name") String name){
		return service.readByName(name);
	}

}

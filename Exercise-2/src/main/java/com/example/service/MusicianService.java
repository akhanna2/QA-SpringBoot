package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.exception.MusicianNotFoundException;
import com.example.persistence.domain.Musician;
import com.example.persistence.repository.MusicianRepository;
import com.example.rest.dto.MusicianDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MusicianService {
	
	private MusicianRepository repo;
	private ModelMapper mapper;
	
	private MusicianDTO mapToDTO(Musician musician) {
		return this.mapper.map(musician, MusicianDTO.class);
	}
	
	public MusicianDTO addMusician(Musician musician){
		Musician saved = this.repo.save(musician);
		return this.mapToDTO(saved);
	}
	
	public List<MusicianDTO> getAllMusicians(){
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public MusicianDTO updateMusician(Long id, Musician musician) {
		Optional<Musician> tempMusician = Optional.of(this.repo.findById(id).orElseThrow(MusicianNotFoundException::new));
		Musician existing = tempMusician.get();
		
		existing.setName(musician.getName());
		existing.setStrings(musician.getStrings());
		existing.setType(musician.getType());
		existing.setBand(musician.getBand());
		
		Musician updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteMusician(Long id) {
		this.repo.findById(id).orElseThrow(MusicianNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public MusicianDTO readById(Long id) {
		Musician found =  this.repo.findById(id).orElseThrow(MusicianNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public List<MusicianDTO> readByName(String name){
		List<Musician> found = this.repo.musicianByName(name).orElseThrow(MusicianNotFoundException::new);
		return found.stream().map(this::mapToDTO).collect(Collectors.toList());
	}

}

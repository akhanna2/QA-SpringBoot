package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.dto.PersonDTO;
import com.example.model.Person;
import com.example.repo.PersonRepo;

@Service
public class PersonService {
	private PersonRepo repo;

	private ModelMapper mapper;

	public PersonService(PersonRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}

	private PersonDTO mapToDTO(Person person) {
		return this.mapper.map(person, PersonDTO.class);
	}

	public PersonDTO addPerson(Person person) {
		Person saved = this.repo.save(person);
		return this.mapToDTO(saved);
	}

	public List<PersonDTO> getAllPeople() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public PersonDTO updatePerson(Long id, Person newPerson) {
		Optional<Person> existingOptional = this.repo.findById(id);
		Person existing = existingOptional.get();

		existing.setAge(newPerson.getAge());
		existing.setName(newPerson.getName());

		Person updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean removePerson(Long id) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
}

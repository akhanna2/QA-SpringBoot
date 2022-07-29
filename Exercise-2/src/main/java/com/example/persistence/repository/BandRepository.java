package com.example.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Band;

@Repository
public interface BandRepository extends JpaRepository<Band, Long>{
	
	@Query("select b from Band b where b.name=?1")
	Optional<Band> bandByName(String name);
}

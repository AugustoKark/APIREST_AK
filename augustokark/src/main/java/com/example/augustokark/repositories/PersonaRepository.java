package com.example.augustokark.repositories;

import com.example.augustokark.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends BaseRepository<Persona, Long> {

}

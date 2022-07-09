package com.test.crud.demo.repositories;

import com.test.crud.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}

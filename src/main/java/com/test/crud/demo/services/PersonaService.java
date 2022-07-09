package com.test.crud.demo.services;

import com.test.crud.demo.entities.Persona;
import com.test.crud.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public Persona getPersona()

    {
        return new Persona( 1,"pepe","jorge");

    }


    public void savePersona(Persona laPersona)
    {
        personaRepository.save(laPersona);
    }

}

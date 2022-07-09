package com.test.crud.demo.controlllers;

import com.test.crud.demo.entities.Persona;
import com.test.crud.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService pService;

    @GetMapping("/get")
    public Persona getPersona()
        {
            return pService.getPersona();
        }

    @PostMapping("/save")
    public void savePersona(@RequestBody Persona LaPersona)
    {
        pService.savePersona(LaPersona
        );
    }
}

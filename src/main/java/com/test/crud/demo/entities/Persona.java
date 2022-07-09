package com.test.crud.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@Entity (name="LaPersona")
public class Persona {
    @Id
    @GeneratedValue
    private  Integer PersonaID;
    private  String Apellido;
    private  String Nombre;
}


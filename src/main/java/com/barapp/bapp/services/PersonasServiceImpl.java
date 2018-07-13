package com.barapp.bapp.services;

import org.springframework.stereotype.Service;

import com.barapp.bapp.persistence.entities.Persona;

@Service ("personasService")
public class PersonasServiceImpl implements PersonaService{

	public Persona personasEquipo() {

		final Persona persona = new Persona();
	    persona.setFirstname("Eder");
	    persona.setLastname("o David");
	    return persona;
	}

	public String saludo(Persona persona) {

		return "Saludo a la persona que se ha recibido, HOLA  " + persona.getFirstname() + " " + persona.getLastname() + "!";
	}

	
}

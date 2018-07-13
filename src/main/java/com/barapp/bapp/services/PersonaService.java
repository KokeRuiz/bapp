package com.barapp.bapp.services;

import com.barapp.bapp.persistence.entities.Persona;

public interface PersonaService {

	Persona personasEquipo();

	String saludo (Persona persona);
}

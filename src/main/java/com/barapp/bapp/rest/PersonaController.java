package com.barapp.bapp.rest;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barapp.bapp.persistence.entities.Persona;
import com.barapp.bapp.services.PersonaService;

@RestController
@RequestMapping("/persona")
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
class PersonaController {

	@Autowired
	private PersonaService personas;

	@GetMapping("/hola")
	public Persona hello() {
		final Persona person = new Persona();
		person.setFirstname("Koke");
		person.setLastname("Rda");
		return person;
	}

	@PostMapping("/hola")
	public String postHello(@RequestBody final Persona persona) {
		return "Hola " + persona.getFirstname() + " " + persona.getLastname()
				+ "!";
	}

	@GetMapping("/koke")
	public Persona persona() {
		return personas.personasEquipo();
	}

	@PostMapping("/saludo")
	public String saludo(@RequestBody final Persona persona) {
		return personas.saludo(persona);
	}

	@RequestMapping(value = "/{nombre}/saludo")
	public String saludo(@PathVariable("nombre") String nombre) {
		return "Muy buenas don " + nombre;
	}

	@GetMapping("/saludo")
	public String saludo(@RequestParam(value = "nombre", required=true) String nombre,
			@RequestParam(value = "apellido", required=false) String apellido) {
		return "Muy buenos dias " + nombre + " " + apellido;
	}
}
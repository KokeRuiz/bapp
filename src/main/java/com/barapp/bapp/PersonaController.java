package com.barapp.bapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
class PersonaController {

  @GetMapping("/hola")
  public Persona hello() {
    final Persona person = new Persona();
    person.setFirstname("Koke");
    person.setLastname("Rda");
    return person;
  }
}
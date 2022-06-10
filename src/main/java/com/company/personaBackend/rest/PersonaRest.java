package com.company.personaBackend.rest;

import com.company.personaBackend.model.Persona;
import com.company.personaBackend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping ("/personas/")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<Persona>> getAllPersonas (){
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Persona> savePersona (@RequestBody Persona persona) {
        try {
            Persona personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}

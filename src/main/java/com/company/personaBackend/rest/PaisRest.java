package com.company.personaBackend.rest;


import com.company.personaBackend.model.Pais;
import com.company.personaBackend.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/paises/")
public class PaisRest {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises () {
        return ResponseEntity.ok(paisService.findAll());
    }
}

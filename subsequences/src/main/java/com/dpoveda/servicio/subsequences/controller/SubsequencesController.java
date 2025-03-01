package com.dpoveda.servicio.subsequences.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subsequences")
public class SubsequencesController {

    @GetMapping("/algoritmo/{tipoS}/{tipoT}")
    public ResponseEntity distinctSubSequences(@PathVariable String tipoS, @PathVariable String tipoT) {
        String mensaje = "Hola mundo";
        return ResponseEntity.ok().body(mensaje);
    }
}

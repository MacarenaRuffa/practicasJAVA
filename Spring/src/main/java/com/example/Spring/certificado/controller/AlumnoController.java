package com.example.Spring.certificado.controller;

import com.example.Spring.certificado.model.Alumno;
import com.example.Spring.certificado.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    private final AlumnoService alumnoService;

    @Autowired
    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping("/calcular_promedio")
    public ResponseEntity<Object> calcularPromedio(@RequestBody Alumno alumno) {
        return ResponseEntity.status(HttpStatus.OK).body(alumnoService.calcularPromedio(alumno));
    }
}

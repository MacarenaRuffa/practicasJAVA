package com.example.Spring.certificado.service;

import com.example.Spring.certificado.model.Alumno;
import com.example.Spring.certificado.model.Diploma;

public interface AlumnoService {
    Diploma calcularPromedio(Alumno alumno);
}

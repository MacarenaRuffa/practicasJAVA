package com.example.Spring.calcuM2.service.controller;

import com.example.Spring.calcuM2.service.model.Habitacion;
import com.example.Spring.calcuM2.service.model.Propiedad;
import com.example.Spring.calcuM2.service.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/propiedad")
public class PropiedadController {
    private final PropiedadService propiedadService;

    @Autowired
    public PropiedadController(PropiedadService propiedadService) {
        this.propiedadService = propiedadService;
    }

    @PostMapping("/calcular_area")
    public double calculateTotalArea(@RequestBody Propiedad propiedad) {
        return propiedadService.calculateTotalArea(propiedad);
    }

    @PostMapping("/calcular_valor")
    public double calculatePropertyValue(@RequestBody Propiedad propiedad) {
        return propiedadService.calculatePropertyValue(propiedad);
    }

    @PostMapping("/obtener_habitacion_mas_grande")
    public Habitacion getLargestRoom(@RequestBody Propiedad propiedad) {
        return propiedadService.getLargestRoom(propiedad);
    }

    @PostMapping("/calcular_area_por_habitacion")
    public Map<String, Double> calculateAreaPerRoom(@RequestBody Propiedad propiedad) {
        return propiedadService.calculateAreaPerRoom(propiedad);
    }
}
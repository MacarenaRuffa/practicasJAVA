package com.example.Spring.calcuM2.service.service;

import com.example.Spring.calcuM2.service.model.Habitacion;
import com.example.Spring.calcuM2.service.model.Propiedad;

import java.util.Map;

public interface PropiedadService {
    double calculateTotalArea(Propiedad property);
    double calculatePropertyValue(Propiedad property);
    Habitacion getLargestRoom(Propiedad property);
    Map<String, Double> calculateAreaPerRoom(Propiedad property);
}

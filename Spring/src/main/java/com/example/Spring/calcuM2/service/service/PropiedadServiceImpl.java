package com.example.Spring.calcuM2.service.service;

import com.example.Spring.calcuM2.service.model.Habitacion;
import com.example.Spring.calcuM2.service.model.Propiedad;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PropiedadServiceImpl implements PropiedadService {
    @Override
    public double calculateTotalArea(Propiedad propiedad) {
        double totalArea = 0;
        for (Habitacion room : propiedad.getRooms()) {
            totalArea += room.getWidth() * room.getLength();
        }
        return totalArea;
    }

    @Override
    public double calculatePropertyValue(Propiedad propiedad) {
        double totalArea = calculateTotalArea(propiedad);
        return totalArea * 800; // Assuming $800 per square meter
    }

    @Override
    public Habitacion getLargestRoom(Propiedad propiedad) {
        Habitacion largestRoom = null;
        double maxArea = Double.MIN_VALUE;
        for (Habitacion room : propiedad.getRooms()) {
            double area = room.getWidth() * room.getLength();
            if (area > maxArea) {
                maxArea = area;
                largestRoom = room;
            }
        }
        return largestRoom;
    }

    @Override
    public Map<String, Double> calculateAreaPerRoom(Propiedad propiedad) {
        Map<String, Double> areaPerRoom = new HashMap<>();
        for (Habitacion room : propiedad.getRooms()) {
            double area = room.getWidth() * room.getLength();
            areaPerRoom.put(room.getName(), area);
        }
        return areaPerRoom;
    }
}


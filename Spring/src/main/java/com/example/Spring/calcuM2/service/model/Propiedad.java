package com.example.Spring.calcuM2.service.model;

import java.util.List;

public class Propiedad {
    private String name;
    private String address;
    private List<Habitacion> rooms;

    public Propiedad() {
    }

    public Propiedad(String name, String address, List<Habitacion> rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Habitacion> getRooms() {
        return rooms;
    }

    public void setRooms(List<Habitacion> rooms) {
        this.rooms = rooms;
    }
}
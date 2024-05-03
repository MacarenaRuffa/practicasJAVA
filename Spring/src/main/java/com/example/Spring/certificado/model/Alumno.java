package com.example.Spring.certificado.model;

public class Alumno {
    private String nombre;
    private String apellido;
    private double[] calificaciones;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, double[] calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}

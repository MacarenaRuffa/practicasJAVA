package org.example.poo.practicaAlumnos;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private double promedio;

    public Alumno(String nombre, String apellido, double promedio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }
}

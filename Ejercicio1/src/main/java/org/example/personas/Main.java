package org.example.personas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", 25));
        personas.add(new Persona(2, "María", 35));
        personas.add(new Persona(3, "Pedro", 40));
        personas.add(new Persona(4, "Ana", 20));
        personas.add(new Persona(5, "Luis", 45));

        System.out.println("Personas mayores de 30 años:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> System.out.println(persona.getNombre()));

        int sumatoriaEdadesMayores30 = personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .mapToInt(Persona::getEdad)
                .sum();
        System.out.println("Sumatoria de edades de personas mayores de 30 años: " + sumatoriaEdadesMayores30);

        System.out.println("Personas mayores de 30 años ordenadas por edad:");
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .sorted(Comparator.comparingInt(Persona::getEdad))
                .forEach(persona -> System.out.println(persona.getNombre() + " - Edad: " + persona.getEdad()));
    }
}

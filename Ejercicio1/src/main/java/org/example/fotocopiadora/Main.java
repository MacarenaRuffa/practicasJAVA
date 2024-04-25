package org.example.fotocopiadora;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n");
        System.out.println("Imprimiendo CV");
        Curriculum curriculum = new Curriculum("001", "Juan Perez", "12345678", "Ingeniero", 5);
        curriculum.imprimir();
        System.out.print("\n");
        System.out.println("Imprimiendo libro PDF");
        LibroPDF libro = new LibroPDF("002", "El Quijote", "Miguel de Cervantes", "Novela", 300);
        libro.imprimir();
        System.out.print("\n");
        System.out.println("Imprimiendo informe");
        Informe informe = new Informe("003", "Análisis financiero del trimestre", "Ana López", "Pedro Gómez", 10);
        informe.imprimir();
    }
}
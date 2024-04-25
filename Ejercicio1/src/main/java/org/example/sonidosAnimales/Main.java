package org.example.sonidosAnimales;

import static org.example.sonidosAnimales.Animal.comerAnimal;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        perro.emitirSonido();
        perro.comerCarne();

        gato.emitirSonido();
        gato.comerCarne();

        vaca.emitirSonido();
        vaca.comerHierba();

        // Invocación del método comerAnimal
        Animal.comerAnimal(perro);
        Animal.comerAnimal(gato);
        Animal.comerAnimal(vaca);
    }
}

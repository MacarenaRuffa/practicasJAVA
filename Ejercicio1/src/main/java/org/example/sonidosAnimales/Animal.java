package org.example.sonidosAnimales;

abstract class Animal {
    abstract void emitirSonido();

    // Método para comer cualquier tipo de animal
    public static void comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Herbivoro) {
            ((Herbivoro) animal).comerHierba();
        }
    }

}



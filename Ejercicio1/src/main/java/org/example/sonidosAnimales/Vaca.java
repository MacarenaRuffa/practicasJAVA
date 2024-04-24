package org.example.sonidosAnimales;

class Vaca extends Animal implements Herbivoro {
    @Override
    void emitirSonido() {
        System.out.println("Muuu");
    }

    @Override
    public void comerHierba() {
        System.out.println("Soy una vaca y como hierba");
    }
}

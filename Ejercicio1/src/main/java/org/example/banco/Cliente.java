package org.example.banco;

class Cliente implements Transaccion {

    public Cliente() {
    }

    @Override
    public void transaccionOk() {
        System.out.println("Transacción ejecutada correctamente.");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Error en la transacción.");
    }
}
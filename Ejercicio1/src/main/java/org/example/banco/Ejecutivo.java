package org.example.banco;

class Ejecutivo implements TransaccionBancaria {
    @Override
    public void transaccionOk() {
        System.out.println("Transacción realizada correctamente.");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Transacción fallida.");
    }

    public void deposito() {
        System.out.println("Depósito realizado correctamente.");
    }

    public void transferencia() {
        System.out.println("Transferencia realizada correctamente.");
    }
}

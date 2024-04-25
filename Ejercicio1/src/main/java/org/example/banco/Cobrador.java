package org.example.banco;

class Cobrador implements TransaccionBancaria {
    @Override
    public void transaccionOk() {
        System.out.println("Transacción realizada correctamente.");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Transacción fallida.");
    }

    public void retiroEfectivo() {
        System.out.println("Retiro de efectivo realizado correctamente.");
    }

    public void consultaSaldo() {
        System.out.println("Consulta de saldo realizada.");
    }
}

package org.example.banco;

class Basico implements TransaccionBancaria {
    @Override
    public void transaccionOk() {
        System.out.println("Transacción realizada correctamente.");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Transacción fallida.");
    }

    public void consultaSaldo() {
        System.out.println("Consulta de saldo realizada.");
    }

    public void pagoServicios() {
        System.out.println("Pago de servicios realizado correctamente.");
    }

    public void retiroEfectivo() {
        System.out.println("Retiro de efectivo realizado correctamente.");
    }
}

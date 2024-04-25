package org.example.banco;

public class Main {
    public static void main(String[] args) {
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.deposito();
        ejecutivo.transaccionOk();

        Basico basico = new Basico();
        basico.consultaSaldo();
        basico.transaccionNoOk();

        Cobrador cobrador = new Cobrador();
        cobrador.retiroEfectivo();
        cobrador.transaccionOk();
    }
}
package org.example.banco;

public class Main {
    public static void main(String[] args) {
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.transferencia();
        ejecutivo.transaccionOk();

        Basico basico = new Basico();
        basico.pagoServicios();
        basico.transaccionOk();

        Cobrador cobrador = new Cobrador();
        cobrador.retiroEfectivo();
        cobrador.transaccionNoOk();
    }
}
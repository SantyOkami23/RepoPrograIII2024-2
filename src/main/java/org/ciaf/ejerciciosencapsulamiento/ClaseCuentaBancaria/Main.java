package org.ciaf.ejerciciosencapsulamiento.ClaseCuentaBancaria;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 500000);

        // Realizar operaciones
        cuenta.depositar(200000);
        cuenta.retirar(10000);
        cuenta.retirar(700);

        // Obtener el saldo actual
        System.out.println("Saldo actual: $" + cuenta.obtenerSaldo());
    }
}

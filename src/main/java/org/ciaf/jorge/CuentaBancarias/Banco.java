package org.ciaf.jorge.CuentaBancarias;

public class Banco {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez");

        // Crear una cuenta bancaria para el cliente
        CuentaBancaria cuenta = new CuentaBancaria(cliente, 1000);

        // Realizar operaciones
        System.out.println("Cliente: " + cuenta.getCliente().getNombreCliente());
        System.out.println(cuenta.depositar(500)); // Depósito
        System.out.println(cuenta.retirar(300));   // Retiro
        System.out.println(cuenta.obtenerSaldo()); // Obtener saldo
    }
}

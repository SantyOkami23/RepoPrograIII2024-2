package org.ciaf.ejerciciosencapsulamiento.ClaseCuentaBancaria;

public class CuentaBancaria {
    private double saldo;
    private String nombreCliente;

    public CuentaBancaria(String nombreCliente, double saldoInicial) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado.");
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado.");
        } else {
            System.out.println("Error: Saldo insuficiente o cantidad inválida.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}


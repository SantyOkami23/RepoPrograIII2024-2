package org.ciaf.jorge.CuentaBancarias;

public class CuentaBancaria {
    private double saldo;
    private Cliente cliente;  // Asociación con la clase Cliente

    public CuentaBancaria(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public String depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return "Depósito exitoso. Saldo actual: " + saldo;
        } else {
            return "La cantidad a depositar debe ser positiva.";
        }
    }

    public String retirar(double cantidad) {
        if (cantidad > saldo) {
            return "Fondos insuficientes para realizar el retiro.";
        } else if (cantidad <= 0) {
            return "La cantidad a retirar debe ser mayor que cero.";
        } else {
            saldo -= cantidad;
            return "Retiro exitoso. Saldo actual: " + saldo;
        }
    }

    public String obtenerSaldo() {
        return "El saldo actual es: " + saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

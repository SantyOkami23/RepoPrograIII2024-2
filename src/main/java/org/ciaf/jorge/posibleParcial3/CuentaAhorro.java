package org.ciaf.jorge.posibleParcial3;

public class CuentaAhorro implements CuentaBancaria {
    private double saldo;
    private double tasaInteres;

    // Constructor
    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    // Método para aplicar intereses
    public void aplicarIntereses() {
        saldo += saldo * tasaInteres;
        System.out.println("Intereses aplicados. Nuevo saldo: $" + saldo);
    }
}
package org.ciaf.jorge.posibleParcial3;

public class CuentaCorriente implements CuentaBancaria {
    private double saldo;
    private double limiteSobregiro;

    // Constructor
    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        this.saldo = saldoInicial;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo + limiteSobregiro >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes, el retiro excede el límite de sobregiro.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    // Método para consultar el límite de sobregiro
    public double consultarLimiteSobregiro() {
        return limiteSobregiro;
    }
}
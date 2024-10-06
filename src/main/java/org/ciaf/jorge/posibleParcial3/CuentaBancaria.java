package org.ciaf.jorge.posibleParcial3;

// CuentaBancaria.java
public interface CuentaBancaria {
    void depositar(double cantidad);
    void retirar(double cantidad);
    double consultarSaldo();
}

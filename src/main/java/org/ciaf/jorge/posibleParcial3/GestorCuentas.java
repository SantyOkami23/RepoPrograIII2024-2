package org.ciaf.jorge.posibleParcial3;

import java.util.ArrayList;
import java.util.List;

public class GestorCuentas {
    private List<CuentaBancaria> listaCuentas;

    // Constructor
    public GestorCuentas() {
        listaCuentas = new ArrayList<>();
    }

    // Método para agregar una cuenta a la lista
    public void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentas.add(cuenta);
    }

    // Método para depositar en una cuenta específica
    public void depositar(int indice, double cantidad) {
        if (indice >= 0 && indice < listaCuentas.size()) {
            CuentaBancaria cuenta = listaCuentas.get(indice);
            cuenta.depositar(cantidad);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para retirar de una cuenta específica
    public void retirar(int indice, double cantidad) {
        if (indice >= 0 && indice < listaCuentas.size()) {
            CuentaBancaria cuenta = listaCuentas.get(indice);
            cuenta.retirar(cantidad);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para consultar el saldo de una cuenta específica
    public void consultarSaldo(int indice) {
        if (indice >= 0 && indice < listaCuentas.size()) {
            CuentaBancaria cuenta = listaCuentas.get(indice);
            System.out.println("Saldo actual: $" + cuenta.consultarSaldo());
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
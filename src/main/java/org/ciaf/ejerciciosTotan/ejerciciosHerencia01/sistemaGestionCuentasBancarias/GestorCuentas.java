package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionCuentasBancarias;

import java.util.ArrayList;
import java.util.List;

public class GestorCuentas {
    private List<CuentaBancaria> cuentas;

    public GestorCuentas() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void depositar(int indiceCuenta, double cantidad) {
        cuentas.get(indiceCuenta).depositar(cantidad);
    }

    public void retirar(int indiceCuenta, double cantidad) {
        cuentas.get(indiceCuenta).retirar(cantidad);
    }

    public double consultarSaldo(int indiceCuenta) {
        return cuentas.get(indiceCuenta).consultarSaldo();
    }
}



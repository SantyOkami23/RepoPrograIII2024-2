package org.ciaf.jorge.posibleParcial3;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de CuentaCorriente y CuentaAhorro
        CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000, 0.03);  // Tasa de interés del 3%

        // Crear el gestor de cuentas
        GestorCuentas gestor = new GestorCuentas();

        // Agregar las cuentas al gestor
        gestor.agregarCuenta(cuentaCorriente);
        gestor.agregarCuenta(cuentaAhorro);

        // Realizar operaciones en las cuentas
        gestor.depositar(0, 100);   // Depositar en cuenta corriente
        gestor.retirar(1, 200);     // Retirar de cuenta de ahorro
        gestor.consultarSaldo(0);   // Consultar saldo de cuenta corriente
        gestor.consultarSaldo(1);   // Consultar saldo de cuenta de ahorro

        // Aplicar intereses a la cuenta de ahorro
        cuentaAhorro.aplicarIntereses();
        gestor.consultarSaldo(1);   // Consultar saldo tras aplicar intereses
    }
}
package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionCuentasBancarias;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cuentas bancarias
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(1000, 500);
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(2000, 0.03);

        // Crear instancia de GestorCuentas
        GestorCuentas gestor = new GestorCuentas();
        gestor.agregarCuenta(cuentaCorriente1);
        gestor.agregarCuenta(cuentaAhorro1);

        // Realizar operaciones
        System.out.println("Saldo inicial Cuenta Corriente: " + gestor.consultarSaldo(0));
        gestor.depositar(0, 200);
        System.out.println("Saldo después de depositar 200 en Cuenta Corriente: " + gestor.consultarSaldo(0));
        gestor.retirar(0, 1500);
        System.out.println("Saldo después de retirar 1500 en Cuenta Corriente: " + gestor.consultarSaldo(0));

        System.out.println("Saldo inicial Cuenta Ahorro: " + gestor.consultarSaldo(1));
        gestor.depositar(1, 500);
        System.out.println("Saldo después de depositar 500 en Cuenta Ahorro: " + gestor.consultarSaldo(1));
        gestor.retirar(1, 1000);
        System.out.println("Saldo después de retirar 1000 en Cuenta Ahorro: " + gestor.consultarSaldo(1));

        // Aplicar interés a la cuenta de ahorro
        cuentaAhorro1.aplicarIntereses();
        System.out.println("Saldo después de aplicar interés en Cuenta Ahorro: " + gestor.consultarSaldo(1));
    }
    }


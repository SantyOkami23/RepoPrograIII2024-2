package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionCuentasBancarias;

public class CuentaCorriente implements CuentaBancaria{
    private double saldo;
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        this.saldo = saldoInicial;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void depositar(double cantidad){
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad){
        if (saldo + limiteSobregiro >= cantidad){
            saldo -= cantidad;
        }else{
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }
}

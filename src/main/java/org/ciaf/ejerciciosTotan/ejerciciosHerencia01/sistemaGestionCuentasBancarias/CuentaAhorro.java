package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionCuentasBancarias;

public class CuentaAhorro implements CuentaBancaria{
    private double saldo;
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double cantidad){
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad){
        if (saldo >= cantidad){
            saldo -= cantidad;
        }else{
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

    public void aplicarIntereses(){
        saldo += saldo * tasaInteres;
    }
}

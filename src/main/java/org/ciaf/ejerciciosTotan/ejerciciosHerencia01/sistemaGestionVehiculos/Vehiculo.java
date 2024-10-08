package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionVehiculos;

abstract class Vehiculo {
    protected  String marca;
    protected String modelo;
    protected int anio;
    protected double velocidadActual;

    public Vehiculo(String marca, String modelo, int anio, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
    }

    public abstract void acelerar(double incremento);

    public abstract void frenar(double decremento);

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }
}

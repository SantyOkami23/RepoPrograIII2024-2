package org.ciaf.jorge.posibleParcial1;

public class Automovil extends Vehiculo {private double velocidadMaxima;

    // Constructor
    public Automovil(String marca, String modelo, int año, double velocidadMaxima) {
        super(marca, modelo, año);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void acelerar(double cantidad) {
        velocidadActual += cantidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
        System.out.println("El automóvil ha acelerado. Velocidad actual: " + velocidadActual + " km/h");
    }

    @Override
    public void frenar(double cantidad) {
        velocidadActual -= cantidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("El automóvil ha frenado. Velocidad actual: " + velocidadActual + " km/h");
    }
}

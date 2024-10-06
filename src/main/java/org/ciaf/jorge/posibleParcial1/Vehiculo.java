package org.ciaf.jorge.posibleParcial1;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double velocidadActual;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadActual = 0;
    }

    // Métodos abstractos
    public abstract void acelerar(double cantidad);
    public abstract void frenar(double cantidad);

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}


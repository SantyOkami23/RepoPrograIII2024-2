package org.ciaf.jorge.posibleParcial4;

public abstract class Plato {
    protected String nombre;
    protected String[] ingredientes;
    protected double precio;

    // Constructor
    public Plato(String nombre, String[] ingredientes, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    // Métodos abstractos
    public abstract double calcularPrecio();
    public abstract void imprimirDetalles();
}
package org.ciaf.jorge.posibleParcia2;

public abstract class Producto {
    protected String nombre;

    // Constructor
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double calcularPrecio();
    public abstract void imprimirDetalles();
}
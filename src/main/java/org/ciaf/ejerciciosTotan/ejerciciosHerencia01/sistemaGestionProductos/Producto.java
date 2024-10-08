package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionProductos;

abstract class Producto {
    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPrecio();
    public abstract void imprimirDetalles();
}

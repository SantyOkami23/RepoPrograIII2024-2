package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionPedidosRestaurante;

abstract class Plato {
    protected String nombre;
    protected String ingredientes;
    protected double precio;

    public Plato(String nombre, String ingredientes, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public abstract double calcularPrecio();

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Precio: " + precio);
    }
}

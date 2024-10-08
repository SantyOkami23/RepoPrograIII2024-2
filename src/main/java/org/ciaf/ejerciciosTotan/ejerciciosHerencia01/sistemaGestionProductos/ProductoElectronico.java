package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionProductos;

public class ProductoElectronico extends  Producto {
    private String modelo;
    private double precio;

    public ProductoElectronico(String nombre, String modelo, double precio) {
        super(nombre);
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Producto Electrónico: " + nombre + ", Modelo: " + modelo + ", Precio: $" + precio);
    }
}

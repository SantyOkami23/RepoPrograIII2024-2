package org.ciaf.jorge.posibleParcia2;

public class ProductoElectronico extends Producto {
    private String modelo;
    private double precio;

    // Constructor
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
        System.out.println("Producto Electrónico:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }
}
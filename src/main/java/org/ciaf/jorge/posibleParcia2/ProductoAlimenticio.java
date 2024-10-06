package org.ciaf.jorge.posibleParcia2;

import java.time.LocalDate;

public class ProductoAlimenticio extends Producto {
    private LocalDate fechaCaducidad;
    private double precio;

    // Constructor
    public ProductoAlimenticio(String nombre, LocalDate fechaCaducidad, double precio) {
        super(nombre);
        this.fechaCaducidad = fechaCaducidad;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Producto Alimenticio:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Precio: $" + precio);
    }
}

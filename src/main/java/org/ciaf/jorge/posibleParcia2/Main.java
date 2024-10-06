package org.ciaf.jorge.posibleParcia2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de ProductoElectronico y ProductoAlimenticio
        ProductoElectronico telefono = new ProductoElectronico("Teléfono", "iPhone 13", 990000);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", LocalDate.of(2024, 10, 15), 2000);

        // Crear el gestor de productos
        GestorProductos gestor = new GestorProductos();

        // Agregar los productos al gestor
        gestor.agregarProducto(telefono);
        gestor.agregarProducto(manzana);

        // Imprimir detalles de los productos
        gestor.imprimirDetallesProductos();

        // Calcular y mostrar el precio total
        double precioTotal = gestor.calcularPrecioTotal();
        System.out.println("Precio total de los productos: $" + precioTotal);
    }
}
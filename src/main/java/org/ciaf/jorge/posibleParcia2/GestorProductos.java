package org.ciaf.jorge.posibleParcia2;

import java.util.ArrayList;
import java.util.List;

public class GestorProductos {
    private List<Producto> listaProductos;

    // Constructor
    public GestorProductos() {
        listaProductos = new ArrayList<>();
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    // Método para calcular el precio total de todos los productos
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Producto producto : listaProductos) {
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal;
    }

    // Método para imprimir los detalles de todos los productos
    public void imprimirDetallesProductos() {
        for (Producto producto : listaProductos) {
            producto.imprimirDetalles();
            System.out.println("-----------------------");
        }
    }
}
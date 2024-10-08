package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionProductos;

public class Main {
    public static void main(String[] args) {
        GestorProductos gestor = new GestorProductos();

        ProductoElectronico laptop = new ProductoElectronico("Laptop", "Dell XPS 13", 1200.0);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", "2024-12-31");

        gestor.agregarProducto(laptop);
        gestor.agregarProducto(manzana);

        gestor.imprimirDetallesProductos();
        System.out.println("Precio Total: $" + gestor.calcularPrecioTotal());
    }
    }


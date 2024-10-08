package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionProductos;
import java.util.ArrayList;
import java.util.List;

public class GestorProductos {
    private List<Producto> productos;

    public GestorProductos() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }

    public void imprimirDetallesProductos() {
        for (Producto producto : productos) {
            producto.imprimirDetalles();
        }
    }
}

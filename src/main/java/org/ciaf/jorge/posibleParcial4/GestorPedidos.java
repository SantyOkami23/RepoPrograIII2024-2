package org.ciaf.jorge.posibleParcial4;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {
    private List<Plato> listaPlatos;

    // Constructor
    public GestorPedidos() {
        listaPlatos = new ArrayList<>();
    }

    // Método para agregar un plato al pedido
    public void agregarPlato(Plato plato) {
        listaPlatos.add(plato);
    }

    // Método para calcular el precio total del pedido
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Plato plato : listaPlatos) {
            precioTotal += plato.calcularPrecio();
        }
        return precioTotal;
    }

    // Método para imprimir los detalles de todos los platos del pedido
    public void imprimirDetallesPedido() {
        System.out.println("Detalles del Pedido:");
        for (Plato plato : listaPlatos) {
            plato.imprimirDetalles();
            System.out.println("-----------------------");
        }
    }
}
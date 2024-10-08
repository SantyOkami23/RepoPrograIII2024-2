package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionPedidosRestaurante;

public class Main {
    public static void main(String[] args) {
        GestorPedidos gestor = new GestorPedidos();

        Plato plato1 = new PlatoPrincipal("Spaghetti Bolognese", "Pasta, Carne, Tomate", 12.50);
        Plato plato2 = new Postre("Tiramisu", "Café, Queso Mascarpone, Cacao", 6.00);

        gestor.agregarPlato(plato1);
        gestor.agregarPlato(plato2);

        gestor.imprimirDetallesPlatos();
        System.out.println("Precio Total: " + gestor.calcularPrecioTotal());
    }
    }


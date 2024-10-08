package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionPedidosRestaurante;

public class Postre extends Plato{
    public Postre(String nombre, String ingredientes, double precio) {
        super(nombre, ingredientes, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}

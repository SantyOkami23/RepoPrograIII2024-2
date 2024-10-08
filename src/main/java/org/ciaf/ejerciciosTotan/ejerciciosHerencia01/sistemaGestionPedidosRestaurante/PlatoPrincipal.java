package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionPedidosRestaurante;

public class PlatoPrincipal extends Plato{
    public PlatoPrincipal(String nombre, String ingredientes, double precio) {
        super(nombre, ingredientes, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}

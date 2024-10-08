package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionPedidosRestaurante;
import java.util.ArrayList;
import java.util.List;
public class GestorPedidos {
    private List<Plato> listaPlatos;

    public GestorPedidos() {
        listaPlatos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        listaPlatos.add(plato);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Plato plato : listaPlatos) {
            total += plato.calcularPrecio();
        }
        return total;
    }

    public void imprimirDetallesPlatos() {
        for (Plato plato : listaPlatos) {
            plato.imprimirDetalles();
            System.out.println("-------------------");
        }
    }
}

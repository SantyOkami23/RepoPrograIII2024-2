package org.ciaf.jorge.posibleParcial1;

import java.util.ArrayList;
import java.util.List;


public class GestorVehiculos {
    private List<Vehiculo> listaVehiculos;

    public GestorVehiculos() {
        listaVehiculos = new ArrayList<>();
    }

    // Método para agregar un vehículo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    // Método para acelerar un vehículo en la lista
    public void acelerarVehiculo(int indice, double cantidad) {
        if (indice >= 0 && indice < listaVehiculos.size()) {
            Vehiculo vehiculo = listaVehiculos.get(indice);
            vehiculo.acelerar(cantidad);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para frenar un vehículo en la lista
    public void frenarVehiculo(int indice, double cantidad) {
        if (indice >= 0 && indice < listaVehiculos.size()) {
            Vehiculo vehiculo = listaVehiculos.get(indice);
            vehiculo.frenar(cantidad);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para mostrar la información de todos los vehículos
    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : listaVehiculos) {
            vehiculo.mostrarInfo();
            System.out.println("-----------------------");
        }
    }
}

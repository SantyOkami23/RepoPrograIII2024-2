package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionVehiculos;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
    private List<Vehiculo> vehiculos;

    public GestorVehiculos() {
        vehiculos = new ArrayList<>();
    }

    public void agragarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void acelerarTodos(double incremento){
        for (Vehiculo vehiculo : vehiculos){
            vehiculo.acelerar(incremento);
        }
    }

    public void frenarTodos(double decremento){
        for (Vehiculo vehiculo : vehiculos){
            vehiculo.frenar(decremento);
        }
    }

    public void mostrarVelocidades(){
        for (Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + " - Velocidad actual: " + vehiculo.getVelocidadActual() + " km/h");
        }
    }
}

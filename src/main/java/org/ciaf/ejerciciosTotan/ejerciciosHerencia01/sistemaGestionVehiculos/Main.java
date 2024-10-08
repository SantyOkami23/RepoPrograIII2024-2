package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionVehiculos;

public class Main {
    public static void main(String[] args) {
        GestorVehiculos gestor = new GestorVehiculos();

        Automovil auto1 = new Automovil("Toyota", "Corolla", 2023, 170, 190);
        Automovil auto2 = new Automovil("Mazda", "Cx5", 2022, 160, 200);
        Automovil auto3 = new Automovil("Zuzuki", "Alto", 2020, 120, 170);
        Automovil auto4 = new Automovil("Hyundai", "Tucson", 2024, 140, 190);

        Camion camion1 = new Camion("Volvo", "FH20", 2020, 110, 25, "Carga Pesada");
        Camion camion2 = new Camion("Turbo", "F15", 2010, 90, 15, "Carga Liviana");

        gestor.agragarVehiculo(auto1);
        gestor.agragarVehiculo(auto2);
        gestor.agragarVehiculo(auto3);
        gestor.agragarVehiculo(auto4);
        gestor.agragarVehiculo(camion1);
        gestor.agragarVehiculo(camion2);

        gestor.acelerarTodos(20);
        gestor.mostrarVelocidades();

        gestor.frenarTodos(40);
        gestor.mostrarVelocidades();


    }
}

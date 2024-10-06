package org.ciaf.jorge.posibleParcial1;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Automovil y Camion
        Automovil automovil = new Automovil("Toyota", "Corolla", 2021, 180);
        Camion camion = new Camion("Volvo", "FH16", 2019, 20, "Carga pesada");

        // Crear el gestor de vehículos
        GestorVehiculos gestor = new GestorVehiculos();

        // Agregar los vehículos al gestor
        gestor.agregarVehiculo(automovil);
        gestor.agregarVehiculo(camion);

        // Mostrar la información de los vehículos
        gestor.mostrarVehiculos();

        // Acelerar y frenar los vehículos
        gestor.acelerarVehiculo(0, 50);  // Acelerar el automóvil
        gestor.frenarVehiculo(1, 10);    // Frenar el camión
    }
}

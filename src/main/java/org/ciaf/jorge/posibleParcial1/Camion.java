package org.ciaf.jorge.posibleParcial1;

public class Camion extends Vehiculo {
    private double capacidadCarga; // en toneladas
    private String tipoCarga;

    // Constructor
    public Camion(String marca, String modelo, int año, double capacidadCarga, String tipoCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
        this.tipoCarga = tipoCarga;
    }

    @Override
    public void acelerar(double cantidad) {
        velocidadActual += cantidad;
        System.out.println("El camión ha acelerado. Velocidad actual: " + velocidadActual + " km/h");
    }

    @Override
    public void frenar(double cantidad) {
        velocidadActual -= cantidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("El camión ha frenado. Velocidad actual: " + velocidadActual + " km/h");
    }

    // Método adicional para mostrar la capacidad de carga
    public void mostrarCapacidadCarga() {
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
        System.out.println("Tipo de carga: " + tipoCarga);
    }
}

package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionVehiculos;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private String tipoCarga;

    public Camion(String marca, String modelo, int anio, double velocidadActual, double capacidadCarga, String tipoCarga) {
        super(marca, modelo, anio, velocidadActual);
        this.capacidadCarga = capacidadCarga;
        this.tipoCarga = tipoCarga;
    }

    @Override
    public  void acelerar(double incremento){
        velocidadActual += incremento;
    }

    @Override
    public  void frenar(double decremento){
        velocidadActual -= decremento;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }
}

package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionVehiculos;

public class Automovil extends Vehiculo {
    private double velocidadMaxima;

    public Automovil(String marca, String modelo, int anio, double velocidadActual, double velocidadMaxima) {
        super(marca, modelo, anio, velocidadActual);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void acelerar(double incremento){
        if(velocidadActual + incremento <= velocidadMaxima)
        { velocidadActual += incremento; }
        else{ velocidadActual = velocidadMaxima;}
    }

    @Override
    public void frenar(double decremento){
        if (velocidadActual - decremento >= 0){
            velocidadActual -= decremento;
        }else {
            velocidadActual = 0;
        }
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}

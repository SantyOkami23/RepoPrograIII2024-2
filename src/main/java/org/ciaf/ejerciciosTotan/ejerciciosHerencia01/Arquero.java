package org.ciaf.ejerciciosTotan.ejerciciosHerencia01;

public class Arquero extends Personaje{
    private String traje;
    private boolean escudo;
    private String tipoFlecha;

    public Arquero(String nombre, int vida, String ataque, String traje, boolean escudo, String arma) {
        super(nombre, vida, ataque);
        this.traje = traje;
        this.escudo = escudo;
        this.tipoFlecha = arma;
    }

    public void cambiarFlecha(String tipoFlecha){
        System.out.println("Arquero usando flecha: " + tipoFlecha);
    }

    public void ponerEscudo(){
        escudo = true;
        System.out.println("Escudo activado.");
    }

    public void quitarEscudo(){
        escudo = false;
        System.out.println("Escudo desactivado.");
    }

    public void lanzarFlecha(){
        System.out.println("Lanzando Flecha");
    }
}

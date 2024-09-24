package org.ciaf.ejerciciosTotan.ejerciciosHerencia01;

public class Guerrero extends Personaje{
    private String traje;
    private boolean escudo;
    private String arma;

    public Guerrero(String nombre, int vida, String ataque, String traje, boolean escudo, String arma) {
        super(nombre, vida, ataque);
        this.traje = traje;
        this.escudo = escudo;
        this.arma = arma;
    }

    public void cambiarArma(String arma){
        System.out.println("Grerrero usando: " + arma);
    }

    public void ponerEscudo(){
        escudo = true;
        System.out.println("Escudo activado.");
    }

    public void quitarEscudo(){
        escudo = false;
        System.out.println("Escudo desactivado.");
    }

    public void golpear(){
        System.out.println("Guerrero golpeando.");
    }


}

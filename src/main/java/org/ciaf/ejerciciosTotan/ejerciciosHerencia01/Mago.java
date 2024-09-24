package org.ciaf.ejerciciosTotan.ejerciciosHerencia01;

public class Mago extends Personaje{
    private String capa;
    private boolean hechizo;
    private String arma;

    public Mago(String nombre, int vida, String ataque, String traje, boolean escudo, String arma) {
        super(nombre, vida, ataque);
        this.capa = traje;
        this.hechizo = escudo;
        this.arma = arma;
    }

    public void cambiarCapa(String capa){
        System.out.println("Mago usando capa: " + capa);
    }

    public void activarHechizo(){
        hechizo = true;
        System.out.println("Hechizo activado.");
    }

    public void quitarHechizo(){
        hechizo = false;
        System.out.println("Hechizo desactivado.");
    }
}

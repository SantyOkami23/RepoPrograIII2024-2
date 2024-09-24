package org.ciaf.ejerciciosTotan.ejerciciosHerencia01;

import org.ciaf.ejerciciosherencia.ejerciciouno.Formato;

public class Personaje {
    private String nombre;
    private int vida;
    private String ataque;

    public Personaje (String nombre, int vida, String ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void recibir_danio (int danio){
        vida -= danio;
        System.out.println("Haz recibido ataque, Te queda de vida " + vida);
    }

    public String atacar (String ataque){
        return ataque;
    }
}

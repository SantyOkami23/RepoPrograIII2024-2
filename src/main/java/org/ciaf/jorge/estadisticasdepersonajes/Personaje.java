package org.ciaf.jorge.estadisticasdepersonajes;

public class Personaje {


    protected String nombre;
    protected int vida;
    protected int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personaje otroPersonaje) {
        System.out.println(nombre + " ataca a " + otroPersonaje.nombre + "!");
        otroPersonaje.recibirDanio(ataque);
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        System.out.println(nombre + " recibe " + cantidad + " puntos de daño. Vida restante: " + vida);
        if (vida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

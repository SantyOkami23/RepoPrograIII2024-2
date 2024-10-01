package org.ciaf.jorge.estadisticasdepersonajes;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre) {
        super(nombre, 100, 40);  // Vida: 100, Ataque: 40
        this.mana = 100;  // Mana inicial
    }

    @Override
    public void atacar(Personaje otroPersonaje) {
        if (mana >= 20) {
            System.out.println(nombre + " lanza un hechizo poderoso!");
            otroPersonaje.recibirDanio(ataque + 20);  // Ataque más fuerte
            mana -= 20;  // Gasta mana
        } else {
            System.out.println(nombre + " no tiene suficiente mana para lanzar un hechizo.");
            super.atacar(otroPersonaje);  // Ataque básico
        }
    }
}

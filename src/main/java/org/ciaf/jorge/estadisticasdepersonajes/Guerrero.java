package org.ciaf.jorge.estadisticasdepersonajes;

public class Guerrero extends Personaje {
    private int defensa;

    public Guerrero(String nombre) {
        super(nombre, 150, 30);  // Vida: 150, Ataque: 30
        this.defensa = 10;  // Defensa adicional
    }

    @Override
    public void recibirDanio(int cantidad) {
        int danioReducido = cantidad - defensa;
        if (danioReducido < 0) {
            danioReducido = 0;
        }
        super.recibirDanio(danioReducido);
        System.out.println(nombre + " bloquea parte del daño con su escudo. Daño recibido: " + danioReducido);
    }

}

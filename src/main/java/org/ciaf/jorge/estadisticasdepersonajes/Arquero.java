package org.ciaf.jorge.estadisticasdepersonajes;

public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre) {
        super(nombre, 120, 25);  // Vida: 120, Ataque: 25
        this.precision = 5;  // Aumenta la precisión con ataques repetidos
    }

    @Override
    public void atacar(Personaje otroPersonaje) {
        System.out.println(nombre + " dispara una flecha con precisión " + precision + "!");
        super.atacar(otroPersonaje);
        precision += 1;  // Aumenta la precisión con cada ataque
    }
}

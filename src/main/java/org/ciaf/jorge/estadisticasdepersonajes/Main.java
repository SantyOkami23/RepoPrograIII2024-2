package org.ciaf.jorge.estadisticasdepersonajes;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thorin");
        Mago mago = new Mago("Gandalf");
        Arquero arquero = new Arquero("Legolas");

        // Simulación de combate
        guerrero.atacar(mago);
        if (mago.estaVivo()) {
            mago.atacar(guerrero);
        }

        arquero.atacar(guerrero);
        if (guerrero.estaVivo()) {
            guerrero.atacar(arquero);
        }
    }
}

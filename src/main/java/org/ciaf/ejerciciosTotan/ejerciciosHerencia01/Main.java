package org.ciaf.ejerciciosTotan.ejerciciosHerencia01;

public class Main {
    public static void main(String[] args) {

        Guerrero bolaMetal = new Guerrero("bolaMetal", 10, "lanzamiento de bola","malla",false,"Bola con puas");
        Mago azul = new Mago("Blue",15,"posima blue", "Capa blue",false,"ninguna");
        Arquero fino = new Arquero("fino",10,"Punteria fina","sotana",false,"Flecha triple");

        bolaMetal.golpear();
        bolaMetal.ponerEscudo();
        bolaMetal.recibir_danio(3);

        System.out.println("*****************");
        azul.activarHechizo();
        azul.cambiarCapa("roja");
        azul.atacar("lanzar pocima");
        azul.recibir_danio(2);

        System.out.println("*****************");
        fino.cambiarFlecha("doble");
        fino.recibir_danio(2);
        fino.ponerEscudo();
        fino.lanzarFlecha();
    }
}

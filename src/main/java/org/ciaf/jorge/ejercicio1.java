package org.ciaf.jorge;
 import java.util.Random;

 import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        String[] opciones = {"piedra", "papel", "tijeras"};

        // solicitar a usuario que elija una opcion
        System.out.println("Elige una opcion: piedra, papel o tijeras.");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // verificar si la eleccion del usuario es valida
        boolean esEleccionValida = false;
        for (String opcion : opciones) {
            if (opcion.equalsIgnoreCase(eleccionUsuario)) {
                esEleccionValida = true;
                break;
            }
        }
        if (!esEleccionValida) {
            System.out.println("Eleccion no valida. por favor, elige entre piedra, papel o tijeras.");
            return;
        }

        // Generar la eleccion de la computadora
        int eleccionComputadoraIndex = random.nextInt(3);
        String eleccionComputadora = opciones[eleccionComputadoraIndex];
        System.out.println("la computadora eligio "+ eleccionComputadora);

        // Determinar el resultado del juego
        if ( eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("¡Es un  empate!");

        } else if ((eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadora.equals("Tijeras")) ||
                (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionUsuario.equalsIgnoreCase("Tijeras") && eleccionComputadora.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();




    }

}

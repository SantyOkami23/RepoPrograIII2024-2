package org.ciaf.ejerciciosTotan;

import java.util.Random;
import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    /*Ejercicio de Juego de Piedra, Papel o Tijeras:
Desarrolla un programa en Java que permita al usuario jugar al clásico juego
de Piedra, Papel o Tijeras contra la computadora. El programa debe solicitar al
usuario que elija una de las opciones (Piedra, Papel o Tijeras) y luego generar
aleatoriamente la elección de la computadora. Luego, el programa debe determinar
quién gana según las reglas del juego.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        int posicionOpcionMaquina = random.nextInt(3);
        String opcionMaquina = opciones[posicionOpcionMaquina];
        String opcionUsuario;
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        do{
            System.out.println("Por favor escribe una opcion: Piedra, Papel o Tijera");
            opcionUsuario = sc.nextLine();
            if ((opcionUsuario.equalsIgnoreCase(opcionMaquina))){
                System.out.println("Felicidades Ganaste, tu opcion fue: " + opcionUsuario + " la opcion de la maquina fue:" + opcionMaquina);
            }else{
                System.out.println("Perdiste");
                System.out.println("Intenta de nuevo, tu eres un@ Crack");

            }
        }while (!(opcionUsuario.equalsIgnoreCase(opcionMaquina)));

    }
}

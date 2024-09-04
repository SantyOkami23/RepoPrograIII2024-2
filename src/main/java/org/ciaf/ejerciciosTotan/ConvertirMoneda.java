package org.ciaf.ejerciciosTotan;

import java.util.Random;
import java.util.Scanner;

public class ConvertirMoneda {
    /*Ejercicio de Conversión de Moneda:
Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo, euros).
 Luego, debe realizar la conversión y mostrar el resultado.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        float cantidadConvertir;
        float resultado;
        float dollarPesos = 4159f;
        float euroPesos = 4593.90f;
        float libraesterlinaPesos = 5461.03f;

        do {
            System.out.println("----- Opciones de Conversion de Moneda -----");
            System.out.println("1. Peso Colombiano a Dolar Americano");
            System.out.println("2. Peso Colombiano a Euros");
            System.out.println("3. Peso Colombiano a Libra Esterlina");
            System.out.println("4. Dolar Americano a Peso Colombiano");
            System.out.println("5. Euros a Peso Colombiano");
            System.out.println("6. Libra Esterlina a Peso Colombiano");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();



            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de dinero a convertir: ");
                    cantidadConvertir = sc.nextFloat();
                    System.out.println("Convirtiendo Peso Colombiano a Dolar Americano");
                    resultado = cantidadConvertir / dollarPesos;
                    System.out.println("El resulatado obtenido: " + cantidadConvertir + " Pesos Colombianos son: " + resultado + " Dolares");
                    System.out.println("********************************************************");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dinero a convertir: ");
                    cantidadConvertir = sc.nextFloat();
                    System.out.println("Convirtiendo Peso Colombiano a Euros");
                    resultado = cantidadConvertir / euroPesos;
                    System.out.println("El resulatado obtenido: " + cantidadConvertir + " Pesos Colombianos son: " + resultado + " Euros");
                    System.out.println("********************************************************");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de dinero a convertir: ");
                    cantidadConvertir = sc.nextFloat();
                    System.out.println("Convirtiendo Peso Colombiano a Libra Esterlina");
                    resultado = cantidadConvertir / libraesterlinaPesos;
                    System.out.println("El resulatado obtenido: " + cantidadConvertir + " Pesos Colombianos son: " + resultado + " Libras Esterlinas");
                    System.out.println("********************************************************");
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de dinero a convertir: ");
                    cantidadConvertir = sc.nextFloat();
                    System.out.println("Convirtiendo Dolar Americano a Peso Colombiano");
                    resultado = cantidadConvertir * dollarPesos;
                    System.out.println("El resulatado obtenido: " + cantidadConvertir + " Dolares son: " + resultado + " Pesos Colombianos");
                    System.out.println("********************************************************");
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de dinero a convertir: ");
                    cantidadConvertir = sc.nextFloat();
                    System.out.println("Convirtiendo Euros a Peso Colombiano");
                    resultado = cantidadConvertir * euroPesos;
                    System.out.println("El resulatado obtenido: " + cantidadConvertir + " Euros son: " + resultado + " Pesos Colombianos");
                    System.out.println("********************************************************");
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad de dinero a convertir: ");
                    cantidadConvertir = sc.nextFloat();
                    System.out.println("Convirtiendo Libra Esterlina a Peso Colombiano");
                    resultado = cantidadConvertir * dollarPesos;
                    System.out.println("El resulatado obtenido: " + cantidadConvertir + " Libras esterlinas son: " + resultado + " Pesos Colombianos");
                    System.out.println("********************************************************");
                    break;
                case 7:
                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 7);

    }
}

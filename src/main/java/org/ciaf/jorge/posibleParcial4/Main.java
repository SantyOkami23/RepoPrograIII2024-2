package org.ciaf.jorge.posibleParcial4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorPedidos gestor = new GestorPedidos();

        // Opciones de platos principales
        PlatoPrincipal plato1 = new PlatoPrincipal("Pasta con albondigas", new String[]{"Pasta", "Queso", "carne"}, 35000.00);
        PlatoPrincipal plato2 = new PlatoPrincipal("Pollo a la Parrilla", new String[]{"Pollo", "Especias", "Verduras"}, 29000.00);

        // Opciones de postres
        Postre postre1 = new Postre("Mazamorra", new String[]{"Maiz", "leche", "Panela rallada"}, 6000.00);
        Postre postre2 = new Postre("Helado de Chocolate", new String[]{"Chocolate", "Leche", "Azúcar"}, 8000.00);

        // Simulación de pedido
        boolean seguirPidiendo = true;
        while (seguirPidiendo) {
            System.out.println("Menú:");
            System.out.println("1. Plato Principal: " + plato1.nombre + " - $" + plato1.calcularPrecio());
            System.out.println("2. Plato Principal: " + plato2.nombre + " - $" + plato2.calcularPrecio());
            System.out.println("3. Postre: " + postre1.nombre + " - $" + postre1.calcularPrecio());
            System.out.println("4. Postre: " + postre2.nombre + " - $" + postre2.calcularPrecio());
            System.out.println("5. Finalizar pedido");

            System.out.print("Seleccione el número del plato que desea agregar (1-5): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestor.agregarPlato(plato1);
                    System.out.println(plato1.nombre + " ha sido agregado al pedido.");
                    break;
                case 2:
                    gestor.agregarPlato(plato2);
                    System.out.println(plato2.nombre + " ha sido agregado al pedido.");
                    break;
                case 3:
                    gestor.agregarPlato(postre1);
                    System.out.println(postre1.nombre + " ha sido agregado al pedido.");
                    break;
                case 4:
                    gestor.agregarPlato(postre2);
                    System.out.println(postre2.nombre + " ha sido agregado al pedido.");
                    break;
                case 5:
                    seguirPidiendo = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija un número entre 1 y 5.");
            }
        }

        // Imprimir detalles y precio total del pedido
        gestor.imprimirDetallesPedido();
        System.out.println("Precio total del pedido: $" + gestor.calcularPrecioTotal());
    }
}
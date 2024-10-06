package org.ciaf.jorge.posibleParcial4;

public class Postre extends Plato {

    // Constructor
    public Postre(String nombre, String[] ingredientes, double precio) {
        super(nombre, ingredientes, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Postre: " + nombre);
        System.out.print("Ingredientes: ");
        for (String ingrediente : ingredientes) {
            System.out.print(ingrediente + " ");
        }
        System.out.println("\nPrecio: $" + precio);
    }
}
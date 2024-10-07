package org.ciaf.ejerciciosencapsulamiento.ClaseRectangulo;

public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);

        // Mostrar base, altura y área
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Área: " + rectangulo.calcularArea());

        // Modificar la base y la altura
        rectangulo.setBase(7.0);
        rectangulo.setAltura(4.0);

        // Mostrar valores actualizados y el área
        System.out.println("Base actualizada: " + rectangulo.getBase());
        System.out.println("Altura actualizada: " + rectangulo.getAltura());
        System.out.println("Área actualizada: " + rectangulo.calcularArea());
    }
}

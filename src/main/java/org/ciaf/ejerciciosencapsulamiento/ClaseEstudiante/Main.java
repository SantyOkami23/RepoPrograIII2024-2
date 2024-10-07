package org.ciaf.ejerciciosencapsulamiento.ClaseEstudiante;

public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Carlos López", 20, "Segundo año");

        // Mostrar detalles del estudiante
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Grado: " + estudiante.getGrado());

        // Modificar la edad y el grado
        estudiante.setEdad(21);
        estudiante.setGrado("Tercer año");

        // Mostrar detalles actualizados
        System.out.println("Edad actualizada: " + estudiante.getEdad());
        System.out.println("Grado actualizado: " + estudiante.getGrado());

    }
}

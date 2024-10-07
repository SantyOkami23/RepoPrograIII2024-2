package org.ciaf.ejerciciosencapsulamiento.ClaseEmpleado;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo empleado
        Empleado empleado = new Empleado("Ana García", 30, 2500000);

        // Mostrar datos del empleado
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: $" + empleado.getSalario());

        // Modificar atributos
        empleado.setEdad(35);
        empleado.setSalario(3000000);

        // Mostrar datos actualizados
        System.out.println("Edad actualizada: " + empleado.getEdad());
        System.out.println("Salario actualizado: $" + empleado.getSalario());
    }
}

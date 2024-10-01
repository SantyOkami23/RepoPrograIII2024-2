package org.ciaf.jorge.ClaseEmpleado;

public class Main {
    public static void main(String[] args) {
        // Crear un empleado
        Empleado empleado = new Empleado("Ana López", 30, 2000);

        // Mostrar detalles del empleado
        empleado.mostrarDetalles();

        // Intentar asignar una edad y salario inválidos
        empleado.setEdad(-5); // No se asignará porque es negativo
        empleado.setSalario(-3000); // No se asignará porque es negativo

        // Mostrar detalles después de intentar valores inválidos
        empleado.mostrarDetalles();
    }
}

package org.ciaf.ejerciciosencapsulamiento.ClaseEmpleado;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad >= 0 ? edad : 0; // Validación para edad no negativa
        this.salario = salario >= 0 ? salario : 0; // Validación para salario no negativo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad >= 0 ? edad : 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario >= 0 ? salario : 0;
    }
}


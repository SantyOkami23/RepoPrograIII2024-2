package org.ciaf.ejerciciosencapsulamiento.ClaseEstudiante;

public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad >= 0 ? edad : 0; // Validación para edad no negativa
        this.grado = grado;
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
        if (edad >=0 ) {
        this.edad = edad;
    } else {
            System.out.println("la edad no puede ser negativa");
            this.edad = 0;
        }

    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}


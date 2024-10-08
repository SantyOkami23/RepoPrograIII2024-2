package org.ciaf.ejerciciosTotan.ejerciciosHerencia01.sistemaGestionProductos;

public class ProductoAlimenticio extends Producto{
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String fechaCaducidad) {
        super(nombre);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularPrecio() {
        // Suponiendo un precio fijo para productos alimenticios
        return 10.0;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Producto Alimenticio: " + nombre + ", Fecha de Caducidad: " + fechaCaducidad);
    }
}

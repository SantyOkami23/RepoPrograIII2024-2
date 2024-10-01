package org.ciaf.jorge.ClaseProductos;

public class Producto {
    // Atributos privados
    private String nombre;
    private double precio;
    private int cantidadInventario;

    // Constructor
    public Producto(String nombre, double precio, int cantidadInventario) {
        this.nombre = nombre;
        setPrecio(precio); // Validación de precio
        setCantidadInventario(cantidadInventario); // Validación de cantidad
    }

    // Métodos para obtener los atributos (Encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    // Métodos para establecer los atributos (Encapsulamiento)

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setCantidadInventario(int cantidadInventario) {
        if (cantidadInventario >= 0) {
            this.cantidadInventario = cantidadInventario;
        } else {
            System.out.println("La cantidad en inventario no puede ser negativa.");
        }
    }

    // Método para modificar la cantidad en inventario con validación
    public void modificarInventario(int cantidad) {
        if (cantidadInventario + cantidad >= 0) {
            cantidadInventario += cantidad;
            System.out.println("Inventario actualizado. Nueva cantidad: " + cantidadInventario);
        } else {
            System.out.println("No se puede reducir el inventario por debajo de 0.");
        }
    }

    // Método para mostrar detalles del producto
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en inventario: " + cantidadInventario);
    }
}

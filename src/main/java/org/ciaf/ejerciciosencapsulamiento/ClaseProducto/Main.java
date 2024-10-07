package org.ciaf.ejerciciosencapsulamiento.ClaseProducto;

public class Main {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("Laptop", 3500000, 10);

        // Mostrar detalles del producto
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Inventario: " + producto.getCantidadInventario());

        // Modificar la cantidad en inventario
        producto.setCantidadInventario(15);
        System.out.println("Inventario actualizado: " + producto.getCantidadInventario());

        // Intentar establecer una cantidad negativa en el inventario (debería fallar)
        //producto.setCantidadInventario(-5);
    }
}

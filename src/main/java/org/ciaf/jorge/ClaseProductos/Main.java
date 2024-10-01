package org.ciaf.jorge.ClaseProductos;

public class Main {
    public static void main(String[] args) {
        // Crear un producto con valores válidos
        Producto producto = new Producto("Laptop", 1500, 10);

        // Mostrar detalles del producto
        producto.mostrarDetalles();

        // Modificar el inventario
        producto.modificarInventario(5);   // Agregar 5 unidades al inventario
        producto.modificarInventario(-12); // Intentar reducir más de lo que hay disponible

        // Mostrar detalles después de modificar el inventario
        producto.mostrarDetalles();

        // Probar establecer un precio negativo
        producto.setPrecio(-500); // No se permitirá
    }
}

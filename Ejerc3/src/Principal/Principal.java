package Principal;

import Entidades.Electronico;
import Entidades.Alimento;
import Implementacion.GestionProductos;
import Entidades.Producto;

public class Principal {
    public static void main(String[] args) {
        // Crear instancia de gestión de productos
        GestionProductos gestion = new GestionProductos();

        // Crear algunos productos
        Producto producto1 = new Electronico("E001", "Smartphone", 300.0, 24);
        Producto producto2 = new Alimento("A001", "Arroz", 2.5, "2026-12-31");

        // Agregar productos
        gestion.agregarProducto(producto1);
        gestion.agregarProducto(producto2);

        // Buscar un producto
        Producto encontrado = gestion.buscarProducto("E001");
        if (encontrado != null) {
            encontrado.mostrarDetalles();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Eliminar un producto
        gestion.eliminarProducto("A001");

        // Intentar buscar el producto eliminado
        Producto eliminado = gestion.buscarProducto("A001");
        if (eliminado != null) {
            eliminado.mostrarDetalles();
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
package Implementacion;

import Entidades.Producto;
import java.util.HashMap;

public class GestionProductos {
    private HashMap<String, Producto> productos;

    // Constructor
    public GestionProductos() {
        productos = new HashMap<>();
    }

    // Método para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Método para buscar un producto por código
    public Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    // Método para eliminar un producto por código
    public void eliminarProducto(String codigo) {
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
            System.out.println("Producto con código " + codigo + " eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
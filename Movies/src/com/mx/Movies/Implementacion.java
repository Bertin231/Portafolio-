package com.mx.Movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementacion implements Metodos {

    List<Movies> lista = new ArrayList<Movies>();

    @Override
    public void guardar(Movies movi) {
        // Verificar si ya existe una película con el mismo nombre en la lista
        for (Movies m : lista) {
            if (m.getNombre().equalsIgnoreCase(movi.getNombre())) {
                // Si existe, mostrar un mensaje de error y no agregar la película
                System.out.println("¡Error! La película '" + movi.getNombre() + "' ya está registrada.");
                return;  // Salir del método sin agregar la película
            }
        }
        
        // Si no existe un duplicado, agregar la película a la lista
        lista.add(movi);
        System.out.println("Película '" + movi.getNombre() + "' agregada exitosamente.");
    }

    @Override
    public void editar(int cartelera, Movies movi) {
        // Modificar película en la lista
        lista.set(cartelera, movi);
    }

    @Override
    public void mostrar() {
        // Mostrar las películas ordenadas por nombre
        Collections.sort(lista, (m1, m2) -> m1.getNombre().compareTo(m2.getNombre()));
        System.out.println("Películas ordenadas por nombre:");
        for (Movies movie : lista) {
            System.out.println(movie);
        }

        // Mostrar las películas ordenadas por precio
        Collections.sort(lista, (m1, m2) -> Double.compare(m1.getPrecio(), m2.getPrecio()));
        System.out.println("\nPelículas ordenadas por precio:");
        for (Movies movie : lista) {
            System.out.println(movie);
        }
    }

    @Override
    public void eliminar(int cartelera) {
        // Eliminar película de la lista
        lista.remove(cartelera);
    }

    @Override
    public Movies buscar(int cartelera) {
        // Buscar película por índice
        return lista.get(cartelera);
    }

    public void contar() {
        // Contar cuántas películas hay en la lista
        int cont = lista.size();
        System.out.println("La lista contiene: " + cont + " películas.");
    }
}
	
	


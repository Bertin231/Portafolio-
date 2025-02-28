package com.mx.Movies;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Crear películas de ejemplo
        Movies movi0 = new Movies("Avengers", "Acción", 2018, 27.50, "Stan Lee");
        Movies movi1 = new Movies("Lost", "Suspenso", 2020, 25.50, "Arturo");
        Movies movi2 = new Movies("Spider-man", "Acción", 2215, 25.50, "Stan Lee");
        Movies movi3 = new Movies("Thor", "Acción", 2025, 64.50, "Stan Lee");
        Movies movi4 = new Movies("Alicia", "Terror", 2019, 28.50, "Maria Garza");
        Movies movi5 = new Movies("Precious", "Amor", 2017, 36.50, "Jose Cuevas");

        Movies movi = null;

        // Implementación de la gestión de películas
        Implementacion im = new Implementacion();

        // Guardar las películas iniciales
        im.guardar(movi0);
        im.guardar(movi1);
        im.guardar(movi2);
        im.guardar(movi3);
        im.guardar(movi4);
        im.guardar(movi5);

        // Scanner para recibir datos del usuario
        Scanner datos = new Scanner(System.in);
        int menuP = 0, menuS = 0, indice = 0;
        // Variables locales
        String nombre, genero, director;
        int año;
        double precio;

        do {
            System.out.println("** MENU **");
            System.out.println("1.- ALTA");
            System.out.println("2.- BUSCAR");
            System.out.println("3.- EDITAR");
            System.out.println("4.- ELIMINAR");
            System.out.println("5.- MOSTRAR");
            System.out.println("6.- CONTAR");
            System.out.println("7.- SALIR");
            System.out.println("---- ELIGUE UNA OPCION ---");

            try {
                menuP = datos.nextInt();
                datos.nextLine();
                switch(menuP) {
                    case 1:
                        System.out.println("<<<< ALTA >>>");
                        System.out.println("Llene los siguientes datos sobre la película");

                        System.out.println("NOMBRE");
                        nombre = datos.nextLine();

                        System.out.println("Género");
                        genero = datos.nextLine();

                        System.out.println("Director");
                        director = datos.nextLine();

                        System.out.println("Año");
                        año = datos.nextInt();
                        datos.nextLine();

                        System.out.println("Precio");
                        precio = datos.nextDouble();
                        datos.nextLine();

                        // Instanciar nueva película
                        movi = new Movies(nombre, genero, año, precio, director);

                        // Guardar la película (con validación de duplicados)
                        im.guardar(movi);
                        break;

                    case 2:
                        System.out.println("<<<< BUSCAR >>>>");
                        imprimirDatos(im);
                        if(im.lista.size() > 0) {
                            System.out.println("Indica el índice para mostrar la información");
                            indice = datos.nextInt();
                            datos.nextLine();
                            if(indice >= 0 && indice < im.lista.size()) {
                                movi = im.buscar(indice);
                                System.out.println("Esta es la información completa de la película:\n" + movi);
                            } else {
                                System.out.println("Índice fuera de rango, intenta con uno del menú");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("<<< EDITAR >>>");
                        imprimirDatos(im);

                        if(im.lista.size() > 0) {
                            System.out.println("Indica el índice que deseas editar");
                            indice = datos.nextInt();
                            datos.nextLine();

                            if(indice >= 0 && indice < im.lista.size()) {
                                do {
                                    System.out.println("** MENU EDITAR **");
                                    System.out.println("1.- EDITAR NOMBRE");
                                    System.out.println("2.- EDITAR GÉNERO");
                                    System.out.println("3.- EDITAR DIRECTOR");
                                    System.out.println("4.- EDITAR AÑO");
                                    System.out.println("5.- EDITAR PRECIO");
                                    System.out.println("6.- REGRESAR AL MENÚ PRINCIPAL");
                                    System.out.println("Elige una opción");

                                    menuS = datos.nextInt();
                                    datos.nextLine();
                                    movi = im.buscar(indice);

                                    switch(menuS) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre");
                                            nombre = datos.nextLine();
                                            movi.setNombre(nombre);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo género");
                                            genero = datos.nextLine();
                                            movi.setGenero(genero);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el nuevo director");
                                            director = datos.nextLine();
                                            movi.setDirector(director);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el nuevo año");
                                            año = datos.nextInt();
                                            movi.setAño(año);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese el nuevo precio");
                                            precio = datos.nextDouble();
                                            movi.setPrecio(precio);
                                            break;
                                        case 6:
                                            System.out.println("Regresando al menú principal");
                                            break;
                                        default:
                                            System.out.println("Índice no válido");
                                            break;
                                    }
                                    System.out.println("Edición EXITOSA!!");
                                } while (menuS != 6);
                            } else {
                                System.out.println("Índice fuera del rango, intente con uno del menú");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("<<<< ELIMINAR >>>>");
                        imprimirDatos(im);

                        if(im.lista.size() > 0) {
                            System.out.println("Indica el índice que deseas eliminar");
                            indice = datos.nextInt();
                            datos.nextLine();
                            if(indice >= 0 && indice < im.lista.size()){
                                im.eliminar(indice);
                                System.out.println("La película se eliminó");
                            } else {
                                System.out.println("Índice fuera de rango");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("<<<<< MOSTRAR >>>>>");

                        if(im.lista.size() > 0) {
                            im.mostrar();
                        } else {
                            System.out.println("No hay registros en esta lista");
                        }
                        break;

                    case 6:
                        System.out.println("<<<<< CONTAR >>>>>");
                        im.contar();
                        break;

                    case 7:
                        System.out.println("Saliendo del menú... Vuelve pronto");
                        break;
                    default:
                        System.out.println("Índice fuera de rango, intenta con uno válido!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingresa un número");
                datos.nextLine();

            } catch(Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        } while(menuP != 7);
    }

    // Método estático para imprimir los datos
    public static void imprimirDatos(Implementacion im) {
        System.out.println("<< Películas Registradas >>");
        if(im.lista.size() > 0) {
            for(int i = 0; i < im.lista.size(); i++) {
                System.out.println("La película [" + i + "] de nombre: " + im.lista.get(i).getNombre());
            }
        } else {
            System.out.println("No hay películas registradas en la lista");
        }
    }
}
		

		
		
		
		
		
		
		
		
		
		
		
		




/*
im.mostrar();


movi = im.buscar(0);
System.out.println("Pelicual encontarda" + movi);


movi = im.buscar(2);
movi.setAño(222222);
movi.setPrecio(0000000);
im.mostrar();

im.eliminar(0);
im.mostrar();

im.contar()

*/
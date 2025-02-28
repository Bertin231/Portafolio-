package com.mx.Consolas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        // Se crean las consolas con sus atributos: nombre, marca, precio, año y color
        Consolas consola0 = new Consolas("Play2", "sony", 10.000, 2015, "negro");
        Consolas consola1 = new Consolas("XBOX", "microsoft", 20.000, 2025, "Blanco");
        Consolas consola2 = new Consolas("NINTENDO", "nin", 30.000, 2020, "Verde");
        Consolas consola3 = new Consolas("NES", "neogeo", 10.000, 2014, "Morado");
        Consolas consola4 = new Consolas("GAMEBOY", "nin", 11.000, 2017, "Gris");
        Consolas consola5 = new Consolas("ATARI", "extrem", 20.000, 2018, "Azul");

        Consolas auxConsolas = null; // Variable auxiliar para crear y modificar consolas

        // Lista que almacenará los objetos de tipo Consolas
        List<Consolas> lista = new ArrayList<Consolas>();

        // Se agregan las consolas creadas a la lista
        lista.add(consola0);
        lista.add(consola1);
        lista.add(consola2);
        lista.add(consola3);
        lista.add(consola4);
        lista.add(consola5);

        // Scanner para leer la entrada del usuario
        Scanner scan = null;
        int menuPrincipal = 0, menuSecundario = 0, indice = 0; // Variables para manejar el menú y la edición

        String nombre, marca, color;
        int generasion; // Año de la consola
        double precio; // Precio de la consola

        // Bucle principal del programa (menú interactivo)
        do {
            // Muestra el menú principal
            System.out.println("-------M E N U ---------");
            System.out.println("1.- Agregar nuevo registro");
            System.out.println("2.- Mostrar la lista");
            System.out.println("3.- Editar");
            System.out.println("4.- Buscar un elemento por atributo");
            System.out.println("5.- Eliminar un elemento por atributo");
            System.out.println("6.- Contar todos los elementos");
            System.out.println("7.- Eliminar Todo");
            System.out.println("8.- Salir del menú");
            System.out.println("Elige una opción válida en el menú*");

            // Lee la opción elegida por el usuario
            scan = new Scanner(System.in);
            menuPrincipal = scan.nextInt();

            // Acciones basadas en la opción elegida
            switch (menuPrincipal) {
                case 1: // Opción 1: Agregar un nuevo registro
                    System.out.println("1.- Agregar un nuevo registro");
                    System.out.println("Escribe la marca de la consola");
                    scan = new Scanner(System.in);
                    marca = scan.nextLine();

                    System.out.println("Escribe el nombre de la consola");
                    scan = new Scanner(System.in);
                    nombre = scan.nextLine();

                    System.out.println("Escribe el año de generación de la consola");
                    scan = new Scanner(System.in);
                    generasion = scan.nextInt();

                    System.out.println("Escribe el color de la consola");
                    scan = new Scanner(System.in);
                    color = scan.nextLine();

                    System.out.println("Escribe el precio de la consola");
                    scan = new Scanner(System.in);
                    precio = scan.nextDouble();

                    // Verificar si ya existe el registro por nombre
                    boolean existe = false;
                    for (Consolas consola : lista) {
                        if (consola.getNombre().equalsIgnoreCase(nombre)) {
                            existe = true;
                            break;
                        }
                    }

                    // Si la consola ya existe, no se agrega
                    if (existe) {
                        System.out.println("El registro con ese nombre ya existe.");
                    } else {
                        // Si no existe, se crea y agrega la nueva consola a la lista
                        auxConsolas = new Consolas(nombre, marca, precio, generasion, color);
                        lista.add(auxConsolas);
                        System.out.println("El registro fue exitoso.");
                    }
                    break;

                case 2: // Opción 2: Mostrar la lista de consolas
                    System.out.println("2.- Mostrar la lista");
                    System.out.println("La información almacenada es:\n" + lista);
                    break;

                case 3: // Opción 3: Editar una consola existente
                    System.out.println("3.- Editando un elemento");
                    System.out.println("Ingresa el índice para editar");
                    scan = new Scanner(System.in);
                    indice = scan.nextInt();

                    // Validar si el índice es válido
                    if (indice >= 0 && indice < lista.size()) {
                        auxConsolas = lista.get(indice); // Obtener la consola en el índice elegido

                        // Menú secundario para editar las propiedades de la consola
                        do {
                            System.out.println("1.- Editar marca");
                            System.out.println("2.- Editar el nombre");
                            System.out.println("3.- Editar el año de generación");
                            System.out.println("4.- Editar el color");
                            System.out.println("5.- Editar el precio");
                            System.out.println("6.- Regresar al menú principal");
                            System.out.println("-----Elige una opción para editar-----");
                            scan = new Scanner(System.in);
                            menuSecundario = scan.nextInt();

                            // Dependiendo de la opción seleccionada, se editan los atributos
                            switch (menuSecundario) {
                                case 1: // Editar la marca
                                    System.out.println("Escribe la nueva marca");
                                    scan = new Scanner(System.in);
                                    marca = scan.nextLine();
                                    auxConsolas.setMarca(marca);
                                    lista.set(indice, auxConsolas);
                                    System.out.println("Se editó correctamente la marca");
                                    break;

                                case 2: // Editar el nombre
                                    System.out.println("Escribe el nuevo nombre");
                                    scan = new Scanner(System.in);
                                    nombre = scan.nextLine();
                                    auxConsolas.setNombre(nombre);
                                    lista.set(indice, auxConsolas);
                                    System.out.println("Se editó correctamente el nombre");
                                    break;

                                case 3: // Editar el año de generación
                                    System.out.println("Escribe el nuevo año de generación");
                                    scan = new Scanner(System.in);
                                    generasion = scan.nextInt();
                                    auxConsolas.setGeneracion(generasion);
                                    lista.set(indice, auxConsolas);
                                    System.out.println("Se editó correctamente el año de generación");
                                    break;

                                case 4: // Editar el color
                                    System.out.println("Escribe el nuevo color");
                                    scan = new Scanner(System.in);
                                    color = scan.nextLine();
                                    auxConsolas.setColor(color);
                                    lista.set(indice, auxConsolas);
                                    System.out.println("Se editó correctamente el color");
                                    break;

                                case 5: // Editar el precio
                                    System.out.println("Escribe el nuevo precio");
                                    scan = new Scanner(System.in);
                                    precio = scan.nextDouble();
                                    auxConsolas.setPrecio(precio);
                                    lista.set(indice, auxConsolas);
                                    System.out.println("Se editó correctamente el precio");
                                    break;

                                case 6: // Regresar al menú principal
                                    System.out.println("Regresando al menú Principal...");
                                    break;

                                default:
                                    System.out.println("Índice fuera de rango. Escribe una opción válida.");
                                    break;
                            }

                        } while (menuSecundario != 6); // Repite hasta que el usuario elija salir
                    } else {
                        // Si el índice no es válido, muestra un error
                        System.out.println("Índice fuera de rango. Ingresa un índice válido.");
                    }
                    break;

                case 4: // Opción 4: Buscar un elemento por atributo (nombre)
                    System.out.println("4.- Buscar un elemento por atributo");
                    System.out.println("¿Cuál es el nombre de la consola que buscas?");
                    scan = new Scanner(System.in);
                    nombre = scan.nextLine();

                    boolean encontrado = false;
                    // Busca la consola en la lista por nombre
                    for (Consolas consola : lista) {
                        if (consola.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Elemento encontrado: " + consola);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el elemento con ese nombre.");
                    }
                    break;

                case 5: // Opción 5: Eliminar un elemento por atributo (nombre)
                    System.out.println("5.- Eliminar un elemento por atributo");
                    System.out.println("¿Cuál es el nombre de la consola que deseas eliminar?");
                    scan = new Scanner(System.in);
                    nombre = scan.nextLine();

                    boolean eliminado = false;
                    // Busca la consola y la elimina si la encuentra
                    for (Consolas consola : lista) {
                        if (consola.getNombre().equalsIgnoreCase(nombre)) {
                            lista.remove(consola);
                            System.out.println("Se eliminó correctamente. Lista actualizada: " + lista);
                            eliminado = true;
                            break;
                        }
                    }

                    if (!eliminado) {
                        System.out.println("No se encontró el elemento con ese nombre para eliminar.");
                    }
                    break;

                case 6: // Opción 6: Contar el número de consolas en la lista
                    System.out.println("6.- Contando el tamaño de la lista");
                    System.out.println("Existen: " + lista.size() + " consolas en la lista.");
                    break;

                case 7: // Opción 7: Eliminar todas las consolas
                    System.out.println("7.- Eliminar todo");
                    lista.clear(); // Limpia toda la lista
                    System.out.println("Se eliminaron todos los registros. La lista está vacía.");
                    break;

                case 8: // Opción 8: Salir del menú
                    System.out.println("8.- Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta con una opción válida del menú.");
                    break;
            }

        } while (menuPrincipal != 8); // El programa sigue ejecutándose hasta que el usuario elige salir
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import com.cice.business.IPrestable;
import com.cice.dto.ComicsDTO;
import com.cice.dto.EntidadBaseDTO;
import com.cice.dto.LibroDTO;
import com.cice.dto.RevistaDTO;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NYL
 */
public class Main {

    private static List<EntidadBaseDTO> lista;

    public static void main(String... args) {

        //1º. Cargamos la lista
        rellenaLista();

        //2º. Mostrar menú
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("=                      =");
        System.out.println("= MENU BIBLIOTECA CICE =");
        System.out.println("=                      =");
        System.out.println("========================");
        System.out.println("");

        do {

            mostrarMenu();
            try {
                opcion = sc.nextInt();
                
                 switch (opcion) {
                    case 1:
                        mostrarPrestados();
                        break;
                    case 2:
                        anterioresFecha();
                        break;
                    case 3:
                        imprimirListado();
                        break;
                    case 4:
                        imprimirListadoDiferenciandoPrestado();
                        break;
                    case 5:
                        System.out.println("========================");
                        System.out.println("=     GRACIAS  POR     =");
                        System.out.println("=       UTILIZAR       =");
                        System.out.println("=   BIBLIOTECA  CICE   =");
                        System.out.println("========================");
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("OPCION INTRODUCIDA INCORRECTA.");
                sc.nextLine();
            }
            

        } while (opcion !=5);

    }

    private static void rellenaLista() {
        lista = new ArrayList<>();
        lista.add(new LibroDTO("Colecionista", "ISBN2244", "Cervantes", "2017", "El ingenioso hidalgo Don Quijote de la Mancha"));
        lista.add(new LibroDTO("Bolsillo", "ISBN9987", "Lope de Vega", "2017", "Artículos de Lope"));
        lista.add(new RevistaDTO("2244", "Semanal", "2017", "Hola"));
        lista.add(new RevistaDTO("1025", "Semanal", "2017", "El Jueves"));
        lista.add(new ComicsDTO("2233", "Coleccionista", "2016", "Amazing Spiderman"));
        lista.add(new ComicsDTO("1152", "Coleccionista", "2017", "Dragon Ball GT"));

    }

    private static void mostrarPrestados() {

        System.out.println("TITULOS PRESTADOS: ");
        for (EntidadBaseDTO objeto : lista) {
            if (objeto instanceof IPrestable) {
                boolean estado = ((IPrestable) objeto).esPrestado();

                if (estado) {
                    System.out.println("Prestado: " + objeto.getNombre());
                }

            }
        }
    }

    private static void anterioresFecha() {
        int opcion = 0;
        int fecha = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("INTRODUZCA LA FECHA LÍMITE DE PUBLICACIÓN: ");
        opcion = sc.nextInt();

        for (EntidadBaseDTO objeto : lista) {
            fecha = Integer.parseInt(objeto.getFechaPublicacion());
            if (fecha <= opcion) {
                System.out.println("NOMBRE " + objeto.getNombre());
            }
        }
    }

    private static void imprimirListado() {
        for (EntidadBaseDTO objeto : lista) {
            System.out.println("NOMBRE: " + objeto.getNombre());
        }
    }

    private static void imprimirListadoDiferenciandoPrestado() {
        for (EntidadBaseDTO objeto : lista) {
            if (objeto instanceof IPrestable) {
                boolean estado = ((IPrestable) objeto).esPrestado();

                if (estado) {
                    System.out.println("Prestado: " + objeto.getNombre());
                } else {
                    System.out.println("No prestado: " + objeto.getNombre());
                }
            }

        }
    }

    private static void mostrarMenu() {

        System.out.println("");
        System.out.println("1.- MOSTRAR TODOS LOS PRESTADOS");
        System.out.println("2.- PUBLICACIONES ANTERIORES A UNA FECHA");
        System.out.println("3.- IMPRIMIR EL LISTADO DE PUBLICACIONES");
        System.out.println("4.- IMPRIMIR LISTADO DIFERENCIANDO POR PRÉSTAMO");
        System.out.println("");
        System.out.println("5.- SALIR");
        System.out.println("");
        System.out.print("ELIJA UNA OPCIÓN ");
        System.out.println("");
    }

}

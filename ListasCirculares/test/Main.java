package test;

import domain.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                ListaCircular lista = new ListaCircular();
                Scanner teclado = new Scanner(System.in);

                int opcion = 0;

                do {
                        System.out.println("\n Lista Circular Simple");
                        System.out.println("1. Ingresar nodo");
                        System.out.println("2. Buscar nodo");
                        System.out.println("3. Modificar nodo");
                        System.out.println("4. Eliminar nodo");
                        System.out.println("5.  Desplegar lista");
                        System.out.println("6. Cerrar");

                        System.out.println("\n Escoja una opción");
                        opcion = teclado.nextInt();

                        switch (opcion) {
                        case 1:
                                System.out.println("Ingresar Nodo");
                                System.out.print("Ingrese el valor del nodo a crear: ");
                                int dato = teclado.nextInt();
                                lista.ingresarNodo(dato);
                                break;
                        case 2:
                                System.out.println("Buscar Nodo");
                                System.out.print("Ingrese el valor del nodo a buscar: ");
                                dato = teclado.nextInt();
                                lista.buscarNodo(dato);
                                break;
                        case 3:
                                System.out.println("Modificar Nodo");
                                System.out.println("Ingrese el nodo que desea modificar: ");
                                dato = teclado.nextInt();
                                lista.modificarNodo(dato);
                                break;
                        case 4:
                                break;
                        case 5:
                                System.out.println("\n Listado de Nodos");
                                lista.desplegarLista();
                                break;
                        case 6:
                                break;
                                default:
                        }

                } while (opcion != 6);
        }
}
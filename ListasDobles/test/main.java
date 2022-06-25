package test;

import domain.*;
import java.util.Scanner;

public class main {
        public static void main(String[] args) {

                Scanner dato = new Scanner(System.in);
                ListaDoble ld = new ListaDoble();

                int opcion;

                do {
                        System.out.println("\n\n LISTAS DOBLES");
                        System.out.println("1- Ingresar Nodo");
                        System.out.println("2- Buscar Nodo");
                        System.out.println("3- Modificar Nodo");
                        System.out.println("4- Eliminar Nodo");
                        System.out.println("5- Enlistar");
                        System.out.print("Escoja una opcion: ");
                        opcion = dato.nextInt();

                        switch (opcion) {
                        case 1:
                                System.out.println("\n INGRESAR NODO");
                                System.out.print("Ingrese el dato del nuevo nodo:");
                                int dat = dato.nextInt();
                                ld.ingresarNodo(dat);
                                break;
                        case 2:
                                System.out.println("\n BUSCAR NODO");
                                System.out.print("Ingrese el dato del nodo a buscar: ");
                                dat = dato.nextInt();
                                ld.buscarNodo(dat);
                                break;
                        case 3:
                                System.out.println("\n MODIFICAR NODO");
                                System.out.print("Ingrese el dato del nodo a cambiar: ");
                                dat = dato.nextInt(); 
                                System.out.println("Ingrese el dato del nuevo valor: ");
                                int dat2 = dato.nextInt();
                                ld.modificarNodo(dat, dat2);
                                break;
                        case 4:
                                break;
                        case 5:
                                System.out.println("\n LISTA DE NODOS");
                                ld.desplegarLista();
                                break;
                        default:
                        }

                } while (opcion == 1);
        }
}

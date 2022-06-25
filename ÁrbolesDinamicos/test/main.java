package test;

import java.util.Scanner;

import domain.Arboles;

public class main {
        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                int opcion = 0, elemento;

                Arboles arbol = new Arboles();

                do {
                        try {
                                System.out.print("\n\n1. Crear un arbol binario \n" + "2. PreOrden\n" + "3. PosOrden \n"
                                                + "4. InOrden\n"
                                                + "5. Por Niveles\n"
                                                + "Para salir ingrese cualquier otro numero\n");

                                System.out.print("Seleccione una opción: ");
                                opcion = teclado.nextInt();
                                switch (opcion) {
                                        case 1:
                                                System.out.println("\nIngresa el peso del arbol");
                                                int peso = teclado.nextInt();
                                                for (int i = 0; i < peso; i++) {
                                                        System.out.println("Ingresa el numero de la raiz/nodo " );
                                                        elemento = teclado.nextInt();
                                                        arbol.insertarNodo(elemento);
                                                }
                                                break;
                                        case 2:
                                                if (!arbol.estaVacio()) {
                                                        System.out.println();
                                                        arbol.preOrden(arbol.raiz);
                                                } else {
                                                        System.out.println("No existen datos en el Árbol");
                                                }
                                                break;
                                        case 3:

                                                if (!arbol.estaVacio()) {
                                                        System.out.println();
                                                        arbol.posOrden(arbol.raiz);
                                                } else {
                                                        System.out.println("No existen datos en el Árbol");
                                                }
                                                break;
                                        case 4:
                                                if (!arbol.estaVacio()) {
                                                        System.out.println();
                                                        arbol.inOrden(arbol.raiz);
                                                } else {
                                                        System.out.println("No existen datos en el Árbol");
                                                }
                                                break;
                                        case 5:
                                                if (!arbol.estaVacio()) {
                                                        System.out.println();
                                                        arbol.porNiveles(arbol.raiz);
                                                } else {
                                                        System.out.println("No existen datos en el Árbol");
                                                }
                                                break;

                                        default:
                                                System.exit(0);
                                }

                        } catch (NumberFormatException n) {
                                System.err.println("Error" + n.getMessage());
                        }
                } while (true);

        }
}
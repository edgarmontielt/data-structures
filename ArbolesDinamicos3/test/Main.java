package test;

import java.util.Scanner;

import javax.swing.JOptionPane;

import domain.Arbol;

public class Main {
        public static void main(String[] args) {

                Scanner info = new Scanner(System.in);
                Arbol arbol = new Arbol();
                do {
                        System.out.println("\nCREACIÓN DE ÁRBOLES N-NARIOS PERFECTOS" +
                                        "\n1. Árbol Binario" +
                                        "\n2. Árbol n-nario de grado 3" +
                                        "\n3. Árbol n-nario de grado 4");

                        int opcion = info.nextInt();

                        if (opcion == 1) {
                                do {
                                        System.out.print("\nIngresa el peso del arbol: ");
                                        int peso = info.nextInt();
                                        if (peso == 3 || peso == 7 || peso == 15 || peso == 33) {
                                                for (int i = 1; i <= peso; i++) {
                                                        System.out.print("Ingresa el valor del nodo/raiz " + i + ": ");
                                                        int valor = info.nextInt();
                                                        arbol.insertar(valor);
                                                }
                                                System.out.println("PreOrden");
                                                arbol.preorden();
                                                System.out.println("\nPosOrden");
                                                arbol.posorden();
                                                System.out.println("\nInOrden");
                                                arbol.inorden();
                                                break;
                                        } else {
                                                System.err.println("NO COINCIDE EL PESO CON EL TIPO DE ARBOL");
                                        }
                                } while (1 == 1);
                        }

                        if (opcion == 2) {
                                do {
                                        System.out.print("\nIngresa el peso del arbol: ");
                                        int peso = info.nextInt();
                                        if (peso == 4 || peso == 13) {
                                                for (int i = 1; i <= peso; i++) {
                                                        System.out.print("Ingresa el valor del nodo/raiz " + i + ": ");
                                                        int valor = info.nextInt();
                                                        arbol.insertar(valor);
                                                }
                                                System.out.println("PreOrden");
                                                arbol.preorden();
                                                System.out.println("\nPosOrden");
                                                arbol.posorden();
                                                System.out.println("\nInOrden");
                                                arbol.inorden();
                                                break;
                                        } else {
                                                System.err.println("NO COINCIDE EL PESO CON EL TIPO DE ARBOL");
                                        }
                                } while (1 == 1);

                        }
                } while (1 == 1);
        }
}

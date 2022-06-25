package test;

import java.util.Scanner;

import domain.Arbol;

public class Main {
        public static void main(String[] args) {
                Scanner dato = new Scanner(System.in);
                Arbol arbol = new Arbol();

                System.out.print("Ingresa el peso del Arbol: ");
                int peso = dato.nextInt();

                for (int i = 1; i <= peso; i++) {
                        System.out.print("Ingresa el valor del nodo/raiz " + i + ": ");
                        int valor = dato.nextInt();
                        arbol.insertar(valor);
                }

                System.out.print("Preorden: ");
                arbol.preorden();
                System.out.println();
                System.out.print("Posorden: ");
                arbol.posorden();
                System.out.println();
                System.out.print("Inorden:  ");
                arbol.inorden();
                System.out.println();
                System.out.print("Por niveles: ");
                arbol.porNiveles();
        }
}

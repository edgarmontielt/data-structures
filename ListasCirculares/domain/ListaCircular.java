package domain;

import java.util.Scanner;
public class ListaCircular {
        Scanner teclado = new Scanner(System.in);
        Nodo primero;
        Nodo ultimo;

        public ListaCircular() {
                primero = null;
                ultimo = null;
        }

        public void ingresarNodo(int x) {
                Nodo nuevo = new Nodo();
                nuevo.dato = x;

                if (primero == null) {
                        primero = nuevo;
                        ultimo = primero;
                        primero.siguiente = ultimo;
                } else {
                        ultimo.siguiente = nuevo;
                        nuevo.siguiente = primero;
                        ultimo = nuevo;
                }
        }

        public void buscarNodo(int x) {
                Nodo actual = new Nodo();
                actual = primero;
                boolean encontrar = false;
                do {

                        if (actual.dato == x) {
                                encontrar = true;
                        }
                        actual = actual.siguiente;
                } while (actual != primero);
                if (encontrar == true) {
                        System.out.println("Nodo encontrado");
                } else {
                        System.out.println("Nodo no encontrado");
                }
        }

        public void modificarNodo(int x) {
                Nodo actual = new Nodo();
                actual = primero; 
                do{
                        if(actual.dato == x){
                                System.out.print("Ingrese el nuevo dato para este nodo: ");
                                actual.dato = teclado.nextInt();
                        }
                        actual = actual.siguiente;
                }while(actual != primero); 
        }

        public void desplegarLista() {
                Nodo actual = new Nodo();
                actual = primero;

                do {
                        System.out.println(actual.dato);
                        actual = actual.siguiente;
                } while (actual != primero);
        }
}
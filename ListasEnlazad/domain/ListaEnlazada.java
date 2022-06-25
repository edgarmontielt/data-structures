package domain;

public class ListaEnlazada {
        Nodo primero;
        Nodo ultimo;
        static int contador; 

        public ListaEnlazada() {
                this.primero = null;
                this.ultimo = null;
                ListaEnlazada.contador = ++ListaEnlazada.contador;
        }

        public void insertarDato(int dato) {
                Nodo nuevo = new Nodo();
                nuevo.setDato(dato);

                if (primero == null) {
                        primero = nuevo;
                        primero.siguiente = null;
                        ultimo = primero;
                } else {
                        ultimo.siguiente = nuevo;
                        nuevo.siguiente = null;
                        ultimo = nuevo;
                }
        }

        public void eliminarNodo(int dato) {
                if (primero == null)
                        System.out.println("lista vacía");
                else if (primero.dato == dato)
                        primero = primero.siguiente;
                else {
                        Nodo actual = primero;
                        while ((actual.siguiente) != null && actual.siguiente.dato != dato)
                                actual = actual.siguiente;
                        if (actual.siguiente == null)
                                System.out.println(dato + " no esta en la lista");
                        else {
                                actual.siguiente = actual.siguiente.siguiente;
                        }
                }
        }

        public void verLista() {

                Nodo actual = primero;
                while (actual.siguiente != null) {
                        System.out.println(actual.dato);
                        actual = actual.siguiente;

                }
                System.out.println(actual.dato);
        }


}

/*
 * public void eliminarNodo(int dato){ Nodo actual = new Nodo(); primero =
 * actual;
 * 
 * if (buscarNodo(dato) == true) { System.out.println("Ya");
 * 
 * }
 * 
 * }
 */

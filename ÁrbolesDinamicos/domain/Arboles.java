package domain;

import java.util.LinkedList;
import java.util.Queue;

public class Arboles {
        public Nodo raiz;

        public Arboles() {
                raiz = null;
        }

        public Nodo getRaiz(Nodo raiz) {
                return this.raiz = raiz;
        }

        public void insertarNodo(int valor) {
                Nodo nuevo = new Nodo(valor);

                if (raiz == null) {
                        raiz = nuevo;
                } else {
                        Nodo aux = raiz;
                        Nodo padre;

                        while (true) {
                                padre = aux;
                                if (valor < aux.valor) {
                                        aux = aux.nodIzq;
                                        if (aux == null) {
                                                padre.nodIzq = nuevo;
                                                return;
                                        }
                                } else {
                                        aux = aux.nodDer;
                                        if (aux == null) {
                                                padre.nodDer = nuevo;
                                                return;
                                        }
                                }
                        }
                }
        }       

        public boolean estaVacio() {
                return raiz == null;
        }

        public void preOrden(Nodo nodo) {
                if (nodo != null) {

                        System.out.print(nodo.getValor() + " => ");
                        preOrden(nodo.getNodoIzq());
                        preOrden(nodo.getNodoDer());

                }
        }

        public void posOrden(Nodo nodo) {
                if (nodo != null) {

                        if (nodo != nodo.raiz) {
                                posOrden(nodo.getNodoIzq());
                                posOrden(nodo.getNodoDer());
                                System.out.print(nodo.getValor() + " => ");
                        } else {
                                System.out.print(nodo.getValor());
                        }
                }
        }

        public void inOrden(Nodo nodo) {
                if (nodo != null) {
                        inOrden(nodo.getNodoIzq());
                        System.out.print(nodo.getValor() + " => ");
                        inOrden(nodo.getNodoDer());
                }
        }

        public void porNiveles(Nodo nodo) {
                Queue<Nodo> cola = new LinkedList<>();
                cola.add(nodo);

                try {
                        while (cola.size() != 0) {
                                nodo = cola.poll();
                                System.out.print(nodo.getValor() + " => ");
                                cola.add(nodo.getNodoIzq());
                                cola.add(nodo.getNodoDer());
                        }
                } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Se termino el Árbol");
                }
        }
}

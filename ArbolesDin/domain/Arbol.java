package domain;

import java.util.LinkedList;
import java.util.Queue;

public class Arbol {

        private Nodo raiz;

        public Arbol() {

        }

        public void insertar(int dato) {
                if (this.raiz == null) {
                        this.raiz = new Nodo(dato);
                } else {
                        this.insertarNodo(this.raiz, dato);
                }
        }

        private void insertarNodo(Nodo padre, int valor) {
                if (valor < padre.getValor()) {
                        if (padre.getIzquierdo() == null) {
                                padre.setIzquierdo(new Nodo(valor));
                        } else {
                                this.insertarNodo(padre.getIzquierdo(), valor);
                        }
                } else {
                        if (padre.getDerecho() == null) {
                                padre.setDerecho(new Nodo(valor));
                        } else {
                                this.insertarNodo(padre.getDerecho(), valor);
                        }
                }
        }

        public void preorden() {
                this.preorden(this.raiz);
        }

        private void preorden(Nodo n) {
                if (n != null) {
                        System.out.print("  " + n.getValor());
                        preorden(n.getIzquierdo());
                        preorden(n.getDerecho());
                }
        }

        public void posorden() {
                this.posorden(this.raiz);
        }

        private void posorden(Nodo n) {
                if (n.getIzquierdo() != null) {
                        posorden(n.getIzquierdo());
                } 
                if(n.getDerecho() != null){
                        posorden(n.getDerecho());
                }
                System.out.print("  " + n.getValor());
        }

        public void inorden() {
                this.inorden(this.raiz);
        }

        private void inorden(Nodo n) {
                if (n != null) {
                        inorden(n.getIzquierdo());
                        System.out.print("  " + n.getValor());
                        inorden(n.getDerecho());
                }
        }

        public void porNiveles() {
                this.porNiveles(this.raiz);
        }

        private void porNiveles(Nodo nodo) {
                Queue<Nodo> cola = new LinkedList<>();
                cola.add(nodo);

                try {
                        while (cola.size() != 0) {
                                nodo = cola.poll();
                                System.out.print(nodo.getValor() + "  ");
                                cola.add(nodo.getIzquierdo());
                                cola.add(nodo.getDerecho());
                        }
                } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Se termino el Árbol");
                }
        }
}

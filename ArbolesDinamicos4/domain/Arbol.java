package domain;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Arbol {
        private Nodo raiz;
        private ArrayList<Integer>arreglo = new ArrayList<>();
        private ArrayList<Integer>arreglo2 = new ArrayList<>();
        private ArrayList<Integer>arreglo3 = new ArrayList<>();

        public Arbol() {

        }

        // Método de inserción de nodos publico
        public void insertar(int dato) {
                if (this.raiz == null) {
                        this.raiz = new Nodo(dato);
                } else {
                        this.insertarNodo(this.raiz, dato);
                }
        }

        //Inserción de datos en un árbol binario perfecto: 
        private void insertarNodo(Nodo padre, int valor) {
                if (valor < padre.getValor()) { //Validamos que el valor recibido sea menor a el valor el nodo padre
                        if (padre.getIzquierdo() == null) { //Si es menor, se valida que el espacio este vacío
                                padre.setIzquierdo(new Nodo(valor)); // Si esta vacío se asgina un nuevo nodo con el valor
                        } else {
                                this.insertarNodo(padre.getIzquierdo(), valor); // Sino, se usa recursividad  tomando como punto de partida al nodo izquierdo
                        }
                } else { // Si es mayor al padre se asigna a la derecha
                        if (padre.getDerecho() == null) { // Se valida que se encuentre vacío el nodo derecho
                                padre.setDerecho(new Nodo(valor)); // Si es así, se asigna el valor
                        } else { 
                                this.insertarNodo(padre.getDerecho(), valor); // Sino, e aplica recursividad romando como punto de partida el nodo derecho
                        }
                }
        }

        public void insertar3(int dato) {
                if (this.raiz == null) {
                        this.raiz = new Nodo(dato);
                } else {
                        this.insertarNodo3(this.raiz, dato);
                }
        }

        //Inserción de datos en un árbol de grado 3: 
        private void insertarNodo3(Nodo padre, int valor) {
                if (valor < padre.getValor()) {
                        if (padre.getIzquierdo() == null) {
                                padre.setIzquierdo(new Nodo(valor));
                        } else {
                                this.insertarNodo3(padre.getIzquierdo(), valor);
                        }
                } else if (valor > padre.getIzquierdo().getValor() && valor < padre.getDerecho().getValor()) {
                        if (padre.getIntermedio() == null) {
                                padre.setIntermedio(new Nodo(valor));
                        } else {
                                this.insertarNodo3(padre.getIntermedio(), valor);
                        }
                } else {
                        if (padre.getDerecho() == null) {
                                padre.setDerecho(new Nodo(valor));
                        } else {
                                this.insertarNodo3(padre.getDerecho(), valor);
                        }
                }
        }

        public ArrayList preorden() {
                this.preorden(this.raiz);
                return arreglo;
        }

        private void preorden(Nodo n) {
                if (n != null) {
                        arreglo.add(n.getValor());
                        preorden(n.getIzquierdo());
                        preorden(n.getDerecho());
                }
        }

        public ArrayList posorden() {
                this.posorden(this.raiz);
                return arreglo2;
        }

        private void posorden(Nodo n) {
                if (n.getIzquierdo() != null) {
                        posorden(n.getIzquierdo());
                }
                if (n.getDerecho() != null) {
                        posorden(n.getDerecho());
                }
                arreglo2.add(n.getValor());
        }

        public ArrayList inorden() {
                this.inorden(this.raiz);
                return arreglo3;
        }

        private void inorden(Nodo n) {
                if (n != null) {
                        inorden(n.getIzquierdo());
                        arreglo3.add(n.getValor());
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

package domain;

import java.util.LinkedList;
import java.util.Queue;

public class Arboles {

        public void preOrden(Nodo raiz) {
                if (raiz != null) {
                        System.out.print(raiz.getValor() + " => ");
                        preOrden(raiz.getNodoIzq());
                        preOrden(raiz.getNodoDer());
                }
        }

        public void posOrden(Nodo nodo) {
                if (nodo != null) {
                        posOrden(nodo.getNodoIzq());
                        posOrden(nodo.getNodoDer());
                        System.out.print(nodo.getValor() + " => ");
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

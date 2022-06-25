package test;

import domain.*;

public class Main {
        public static void main(String[] args) {
                Nodo raiz = new Nodo(1);
                Nodo nodo1 = new Nodo(2);
                Nodo nodo2 = new Nodo(3);
                
                // Asignacion de nodos a la raiz 
                raiz.setNodoIzq(nodo1);
                raiz.setNodoDer(nodo2); 

                // Asignacion de nodos hijos a los nodos 1 y 2
                nodo1.setNodoIzq(new Nodo(4));
                nodo1.setNodoDer(new Nodo(5));

                nodo2.setNodoIzq(new Nodo(6));
                nodo2.setNodoDer(new Nodo(7));
                
                Arboles arboles = new Arboles();

                System.out.println("\n \n Búsqueda PreOrden");
                arboles.preOrden(raiz);
                System.out.println("\n \n Búsqueda PosOrden");
                arboles.posOrden(raiz);
                System.out.println("\n \n Búsqueda InOrden");
                arboles.inOrden(raiz);
                System.out.println("\n \n Búsqueda En Amplitud");
                arboles.porNiveles(raiz);
        }
}

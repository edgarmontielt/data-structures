package test;

import java.util.LinkedList;
import java.util.Queue;

import domain.*;

public class main {
        public static void main(String args[]){

                Colas colita=new Colas(5); 
                colita.encolar(1);
                colita.encolar(12);
                colita.encolar(3);
                int r=colita.desencolar();
                System.out.println("El dato eliminado es "+r);
                boolean b=colita.estaVacia();
                boolean c=colita.estaLlena();
                System.out.println("¿Está vacia la pla? "+b);
                System.out.println("¿Está llena la pla? "+c);

                Cola cola = new Cola(); 

                cola.insertar(10);
                cola.insertar(200);
                cola.insertar(373);
                cola.imprimirCola();

                cola.eliminar();

                cola.imprimirCola();

                Queue<Integer> colita2 = new LinkedList<>();
                
                var valor = 10;
                colita2.add(valor);

                System.out.println(colita2);
           }    
}
package test;
import domain.*;
public class Main {
        public static void main(String[] args) {
                ListaEnlazada list = new ListaEnlazada();

                list.insertarDato(10);
                list.insertarDato(20);
                list.insertarDato(40);
                list.verLista();
                list.eliminarNodo(10);
                System.out.println();
                list.verLista();

                Nodo nodo = new Nodo();
                System.out.println(nodo.ver());
        }
}

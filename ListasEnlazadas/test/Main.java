package test;

import java.util.ArrayList;
import java.util.List;

import domain.ListaSimple;

public class Main {

        public static void main(String args[]) {
                System.out.println("Comenzamos");
                ListaSimple n1 = new ListaSimple();
                n1.insertarPrimero(2);
                n1.insertarPrimero(5);
                n1.insertarFinal(3);
                n1.insertarFinal(4);

                System.out.println("Borramos un Elemento");
                n1.borrar(2);
                n1.borrar(5);

                List<String> lista = new ArrayList<String>();
        }
}
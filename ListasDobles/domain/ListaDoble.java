package domain;

public class ListaDoble {
        nodo primero; 
        nodo ultimo; 

        public ListaDoble(){
                primero = null; 
                ultimo = null; 
        }

        public void ingresarNodo(int dato){
                nodo nuevo = new nodo(); 
                nuevo.dato = dato;  

                if(primero == null){
                        primero = nuevo; 
                        primero.siguiente = null; 
                        primero.anterior = null; 
                        ultimo = primero; 
                } else { 
                        ultimo.siguiente = nuevo; 
                        nuevo.anterior = ultimo; 
                        nuevo.siguiente = null; 
                        ultimo = nuevo;
                }
        }

        public void buscarNodo(int dato){
                nodo actual = new nodo(); 
                actual = primero; 
                while(actual != null){
                        if(actual.dato == dato){
                                System.out.println("Nodo encontrado");
                        }

                        actual = actual.siguiente; 
                }
        }

        public void modificarNodo(int dato, int nuevo){
                nodo actual = new nodo();
                actual = primero; 
                while(actual != null){
                        if(actual.dato == dato){
                                actual.dato = nuevo;
                        } else {
                                System.out.println("Nodo no encontrado");
                        }
                        actual = actual.siguiente;
                }
        }

        public void desplegarLista(){
                nodo actual = new nodo(); 
                actual = primero; 
                while(actual != null){
                        System.out.println(actual.dato);
                        actual = actual.siguiente; 

                }
        }



}

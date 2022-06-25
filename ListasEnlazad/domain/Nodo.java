package domain; 

public class Nodo{
        Nodo siguiente; 
        int dato; 
        static int contador; 

        public Nodo(){
                this.contador = ++Nodo.contador;
                
        }

        public Nodo getSiguiente(){
                return this.siguiente; 
        }

        public void setSiguiente(Nodo siguiente){
                this.siguiente = siguiente;
        }

        public int getDato(){
                return this.dato;
        }
        
        public void setDato(int dato){
                this.dato = dato; 
        }


        public int ver(){
                return contador;
        }
}
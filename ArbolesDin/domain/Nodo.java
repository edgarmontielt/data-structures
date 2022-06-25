
package domain;

public class Nodo{

        private int valor; 
        private Nodo izquierdo; 
        private Nodo derecho; 

        //CONSTRUCTOR
        public Nodo(int valor){
                this.valor = valor; 
                this.izquierdo = this.derecho = null;
        }

        //SETTERS AND GETTERS

        public int getValor(){
                return this.valor;
        }

        public void setIzquierdo(Nodo izquierdo){
                this.izquierdo = izquierdo;
        }

        public Nodo getIzquierdo(){
                return izquierdo;
        }

        public void setDerecho(Nodo derecho){
                this.derecho = derecho; 
        }

        public Nodo getDerecho(){
                return derecho;
        }
}
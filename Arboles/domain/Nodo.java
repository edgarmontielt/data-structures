package domain; 

public class Nodo{
        private Nodo raiz;
        private Nodo nodIzq; 
        private Nodo nodDer; 
        private int valor; 

        public Nodo(int valor){
                this.valor = valor; 
        }

        public Nodo(){
                
        }

        public void setRaiz(Nodo raiz){
                this.raiz = raiz; 
        }

        public Nodo getRaiz(){
                return this.raiz;
        }

        public void setNodoIzq(Nodo nodoIzq ){
                this.nodIzq = nodoIzq; 
        }

        public Nodo getNodoIzq(){
                return this.nodIzq;
        }

        public void setNodoDer(Nodo nodoDer){
                this.nodDer = nodoDer;
        }

        public Nodo getNodoDer(){
                return this.nodDer;
        }

        public int getValor(){
                return valor; 
        }
}
package domain; 

public class Nodo{
        private Nodo raiz;
        private Nodo nodIzq;
        private Nodo intermedio;
        private Nodo nodDer;
        private int valor;

        public Nodo(int valor) {
                this.valor = valor;
        }

        public Nodo() {

        }

        public void setRaiz(Nodo raiz) {
                this.raiz = raiz;
        }

        public Nodo getRaiz() {
                return this.raiz;
        }

        public void setIzquierdo(Nodo nodoIzq) {
                this.nodIzq = nodoIzq;
        }

        public Nodo getIzquierdo() {
                return this.nodIzq;
        }

        public void setDerecho(Nodo nodoDer) {
                this.nodDer = nodoDer;
        }

        public Nodo getDerecho() {
                return this.nodDer;
        }

        public void setIntermedio(Nodo intermedio){
                this.intermedio = intermedio;
        }

        public Nodo getIntermedio(){
                return this.intermedio;
        }

        public int getValor() {
                return valor;
        }

        public void setValor(int valor){
                this.valor = valor;
        }
}
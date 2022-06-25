package domain;

public class Cola {
        Nodos nodoCabeza, nodoFinal;
    
        public Cola() {
            // Inicializa la Cola, en este caso su primer estado es vacía
            nodoCabeza = null;
            nodoFinal = null;
        }
        
        public void insertar(int x) {
            Nodos nuevo = new Nodos(x);
            if (nodoCabeza == null && nodoFinal == null) {
                nodoCabeza = nuevo;
            } else {
                nodoFinal.siguiente = nuevo;
            }
            nodoFinal = nuevo;
        }
    
        public int eliminar(){
            if (nodoCabeza == null && nodoFinal == null) {
                System.out.println("Cola vacía, no se puede eliminar");
                return 0;
            } else {
                Nodos nodoEliminado = nodoCabeza;
                nodoCabeza = nodoCabeza.siguiente;
                nodoEliminado.siguiente = null;
                return nodoEliminado.informacion;
            }
        }
        
        public void imprimirCola(){
            if (nodoCabeza == null && nodoFinal == null) {
                System.out.println("Cola vacía");
            }
            else{
                for(Nodos auxiliar = nodoCabeza; auxiliar != null; auxiliar=auxiliar.siguiente){
                    System.out.print(auxiliar.informacion+" ");
                }
                System.out.println();
            }
        }
}

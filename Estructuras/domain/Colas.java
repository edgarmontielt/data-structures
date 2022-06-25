package domain;

public class Colas{
    
    private int cola[];
    private int top;//indica la posición del último elemento insertado
    private int capacidad;
   
    public Colas(int cap){
        capacidad=cap;
        cola=new int[capacidad];
        top=-1;
    }
   
    public boolean estaVacia(){
        return(top==-1);
    }
   
    public boolean estaLlena(){
        return((top+1)==capacidad);
    }
   
    public void encolar(int elemento){
        if(estaLlena()==false){
            cola[++top]=elemento;
            System.out.println("Acoplando elemento "+ elemento);
        }
        else
            System.out.println("Desbordamiento superior, no se puede encolar");
    }
   
    public int desencolar(){
        if(estaVacia()==false){
            int dato=cola[0];
            top--;
            for(int i=0;i<=top;i++){
                cola[i]=cola[i+1];
            }
            return dato;
        }
        else{
            System.out.println("Desbordamiento inferior, no se puede desencolar");
        }
        return -1;
    }
}
      
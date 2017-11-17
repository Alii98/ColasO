package edu.utim.ticsi4b;

/**
 * Created by Alicia Flores on 15/11/2017.
 */
public class Cola {
    public int tamanio;

    private Nodo frente; //el inicio de la cola

    //Constructor simplle
    public Cola(){
        this.frente=null;
    }
    //Método para insertar siguiente elemento (nodo), el elemento debe colocarse detrás del ultimo nodo
    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if (frente==null){
            frente = nuevo;
        }else{
            Nodo temp = frente;
            while(temp.getProximo()!=null){
                temp = temp.getProximo();
            }
            temp.setProximo(nuevo);
        }
        tamanio++;

    }
    //Método para mostrar los elemenros de la cola
    public void Mostrar(){
        if (frente != null){
            Nodo temp = frente;
            System.out.println("Los valores de la cola son:");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp = temp.getProximo();
            }
        }else{
            System.out.println("La cola está vacía");

        }
    }
    //Método para extraer el elemento del frente
    public int extraer(){
        tamanio--;
        if(frente==null){

            return  0;
        }else{
            int valorExtraer = frente.getValor();//Variable temporal
            frente = frente.getProximo(); //Cambia el frente por el siguiente
            System.out.println("Valor extraído: "+ valorExtraer);
            return valorExtraer;//devolver el valor Extraído de la cola
        }

    }
    public int tamanio (){
        return tamanio;
    }


}

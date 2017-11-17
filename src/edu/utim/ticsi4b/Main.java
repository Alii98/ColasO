package edu.utim.ticsi4b;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cola cola = new Cola();
        cola.insertar(10);
        cola.insertar(5);
        cola.insertar(19);
        cola.Mostrar();
        cola.extraer();
        cola.Mostrar();
        cola.insertar(2);
        cola.Mostrar();
        System.out.println("El tamaño de la cola es: " + cola.tamanio());
    }
}

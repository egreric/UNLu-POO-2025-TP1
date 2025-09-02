package ar.edu.unlu.poo.tp1.ej4;

public class MainEj4 {
    public static void main(String[] args){
        Cola cola = new Cola();

        if (cola.esVacia()){    // pregunto si la cola esta vacia
            System.out.println("La cola esta vacia");
        }

        cola.encolar(5);    // cargo 4 elementos en la cola
        cola.encolar(10);
        cola.encolar(15);
        cola.encolar(20);
        System.out.println("Cantidad de elementos actuales cargados en la cola: " + cola.longitud());

        System.out.println(cola.recuperar());   // recupero valor de cola para corroborar que el valor devuelto sea correcto
        cola.desencolar();                      // desencolo varios valores
        cola.desencolar();
        cola.desencolar();

        System.out.println(cola.recuperar());   // recupero valor para ver si mi funcion desencolar funciono correctamente

        System.out.println(cola.esVacia());

        cola.desencolar();
        System.out.println(cola.esVacia());

        System.out.println("Cantidad de elementos actuales cargados en la cola: " + cola.longitud());
    }
}

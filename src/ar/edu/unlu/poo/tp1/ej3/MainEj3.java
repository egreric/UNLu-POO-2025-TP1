package ar.edu.unlu.poo.tp1.ej3;

public class MainEj3 {
    public static void main(String[] args){
        Pila pila = new Pila();
        System.out.println("La pila esta vacia?: " + pila.esVacia());

        pila.apilar(5);

        System.out.println(pila.recuperarTope());

        pila.apilar(10);
        pila.apilar(15);
        pila.apilar(20);

        System.out.println(pila.recuperarTope());

        pila.desapilar();
        System.out.println(pila.recuperarTope());

        pila.desapilar();
        pila.desapilar();
        System.out.println(pila.recuperarTope());

        System.out.println(pila.esVacia());

        pila.desapilar();
        System.out.println(pila.esVacia());
    }
}

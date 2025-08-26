package ar.edu.unlu.poo.tp1.ej1;

public class MainEj1 {
    public static void main(String[] args){
        Nodo nodo1 = new Nodo("Primer NODO");

        System.out.println(nodo1.getDato());
        System.out.println(nodo1.getSiguiente());
        nodo1.setSiguiente(new Nodo("Segundo NODO"));

        System.out.println(nodo1.getSiguiente().getDato());

        System.out.println(nodo1.getSiguiente().getSiguiente());
    }
}

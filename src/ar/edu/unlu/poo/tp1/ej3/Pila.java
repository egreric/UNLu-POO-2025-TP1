package ar.edu.unlu.poo.tp1.ej3;

import ar.edu.unlu.poo.tp1.ej1.Nodo;

public class Pila {
    private Nodo tope;

    public Pila(){
        tope = null;
    }

    public boolean esVacia(){
        return tope == null;
    }

    public int longitud(){
        int cantidad = 0;
        Nodo elementoActual = tope;
        while (elementoActual != null){
            cantidad++;
            elementoActual = elementoActual.getSiguiente();
        }
        return cantidad;
    }

    public void apilar(Object dato){
        Nodo nuevoTope = new Nodo(dato);
        nuevoTope.setSiguiente(tope);
        tope = nuevoTope;
    }

    public void desapilar(){
        tope = tope.getSiguiente();
    }

    public Object recuperarTope() {
        return tope.getDato();
    }

}


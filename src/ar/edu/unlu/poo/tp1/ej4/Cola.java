package ar.edu.unlu.poo.tp1.ej4;

import ar.edu.unlu.poo.tp1.ej1.Nodo;

public class Cola {
    private Nodo primerElemento;
    private Nodo ultimoElemento;

    public Cola(){
        primerElemento = null;
        ultimoElemento = null;
    }

    public boolean esVacia(){
        return (primerElemento == null);
    }

    public int longitud(){
        int cantidad = 0;
        Nodo elementoActual = primerElemento;
        while (elementoActual != null){
            cantidad++;
            elementoActual = elementoActual.getSiguiente();
        }
        return cantidad;
    }

    public void encolar(Object dato){
        Nodo nuevoElemento = new Nodo(dato);
        if (esVacia()){
            primerElemento = nuevoElemento;
        } else {
            ultimoElemento.setSiguiente(nuevoElemento);
        }
        ultimoElemento = nuevoElemento;
    }

    public void desencolar(){
        if (!esVacia()){
            primerElemento = primerElemento.getSiguiente();
        }
    }

    public Object recuperar(){
        return primerElemento.getDato();
    }
}

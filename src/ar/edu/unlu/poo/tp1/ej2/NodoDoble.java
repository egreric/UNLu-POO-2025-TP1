package ar.edu.unlu.poo.tp1.ej2;

public class NodoDoble {

    private Object dato;
    private NodoDoble siguiente;

    private NodoDoble anterior;

    public NodoDoble(Object dato){
        this.dato = dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setAnterior(NodoDoble anterior) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }
}

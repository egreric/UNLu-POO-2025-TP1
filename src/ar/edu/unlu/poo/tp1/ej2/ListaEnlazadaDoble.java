package ar.edu.unlu.poo.tp1.ej2;

import ar.edu.unlu.poo.tp1.ej1.Nodo;

public class ListaEnlazadaDoble {
    private NodoDoble primerElemento;

    // Crear lista es reemplazado por el constructor de la clase
    public ListaEnlazadaDoble(){
        primerElemento = null;
    }

    public boolean esVacia(){
        return primerElemento == null;
    }

    public int longitud(){
        int cantidad = 0;
        NodoDoble elementoActual = primerElemento;
        while (elementoActual != null){
            cantidad++;
            elementoActual = elementoActual.getSiguiente();
        }
        return cantidad;
    }

    public void agregarElemento(Object dato){
        NodoDoble nuevoElemento = new NodoDoble(dato);
        if (esVacia()){
            primerElemento = nuevoElemento;
        } else {
            NodoDoble ultimoElemento = buscaNodo(longitud());
            ultimoElemento.setSiguiente(nuevoElemento);
            nuevoElemento.setAnterior(ultimoElemento);
        }
    }

    public void eliminarElemento(int posicion){
        if (posicionValida(posicion)){
            if (posicion == 1){
                primerElemento = primerElemento.getSiguiente();
                primerElemento.setAnterior(null);
            } else {
                NodoDoble nodoAnterior = buscaNodo(posicion - 1);
                NodoDoble nodoAEliminar = nodoAnterior.getSiguiente();
                nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
                if (nodoAEliminar.getSiguiente() != null){
                    nodoAEliminar.getSiguiente().setAnterior(nodoAnterior);
                }
            }
        }
    }

    public Object recuperarElemento(int posicion) throws Exception {
        if (posicionValida(posicion)){
            return buscaNodo(posicion).getDato();
        } else {
            throw new Exception ("Posicion fuera de rango...");
        }
    }

    public void insertarElemento(Object dato, int posicion){
        if (posicionValida(posicion)){
            NodoDoble nuevoElemento = new NodoDoble(dato);
            if (posicion == 1){
                primerElemento.setAnterior(nuevoElemento);
                nuevoElemento.setSiguiente(primerElemento);
                primerElemento = nuevoElemento;
            } else {
                NodoDoble nodoAnterior = buscaNodo(posicion - 1);
                nuevoElemento.setSiguiente(nodoAnterior.getSiguiente());
                nuevoElemento.setAnterior(nodoAnterior);
                nodoAnterior.setSiguiente(nuevoElemento);
                nuevoElemento.getSiguiente().setAnterior(nuevoElemento);
            }
        }
    }

    private NodoDoble buscaNodo(int posicionBuscada){
        NodoDoble nodoBuscado = primerElemento; // En el caso de que no hubiera elementos en la lista devuelve null
        int posicionActual = 1;
        if (!esVacia() && posicionValida(posicionBuscada)) {
            while (posicionActual != posicionBuscada) {
                nodoBuscado = nodoBuscado.getSiguiente();
                posicionActual++;
            }
        }
        return nodoBuscado;
    }

    private boolean posicionValida(int posicionBuscada){
        return (posicionBuscada > 0) && (posicionBuscada <= longitud());
    }

}

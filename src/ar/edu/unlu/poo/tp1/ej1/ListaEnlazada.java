package ar.edu.unlu.poo.tp1.ej1;

public class ListaEnlazada {
    private Nodo primerElemento;

    // Crear lista es reemplazado por el constructor de la clase
    public ListaEnlazada(){
       primerElemento = null;
    }

    public boolean esVacia(){
        return primerElemento == null;
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

    public void agregarElemento(Object dato){
        Nodo nuevoElemento = new Nodo(dato);
        if (esVacia()){
            primerElemento = nuevoElemento;
        } else {
            buscaNodo(longitud()).setSiguiente(nuevoElemento);
        }
    }

    public void eliminarElemento(int posicion){
        if (posicionValida(posicion)){
            if (posicion == 1){
                primerElemento = primerElemento.getSiguiente();
            } else {
                Nodo nodoAnterior = buscaNodo(posicion - 1);
                Nodo nodoAEliminar = nodoAnterior.getSiguiente();
                nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
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
            Nodo nuevoElemento = new Nodo(dato);
            if (posicion == 1){
                nuevoElemento.setSiguiente(primerElemento);
                primerElemento = nuevoElemento;
            } else {
                Nodo nodoAnterior = buscaNodo(posicion - 1);
                nuevoElemento.setSiguiente(nodoAnterior.getSiguiente());
                nodoAnterior.setSiguiente(nuevoElemento);
            }
        }
    }

    private Nodo buscaNodo(int posicionBuscada){
        Nodo nodoBuscado = primerElemento; // En el caso de que no hubiera elementos en la lista devuelve null
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

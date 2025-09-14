package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int puntaje;
    private ArrayList<String> palabrasFormadas;

    public Jugador(String nombre){
        setNombre(nombre);
        setPuntaje(0);
        palabrasFormadas = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    private void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    }

    public int getPuntaje(){
        return this.puntaje;
    }

    public void sumarPuntaje(int puntaje){
        setPuntaje(getPuntaje() + puntaje);
    }

    public void agregarPalabra(String palabra){
        this.palabrasFormadas.add(palabra);
    }

    public ArrayList<String> getPalabras(){
        return this.palabrasFormadas;
    }

    public boolean buscarPalabra(String palabraBuscada){
        for (String palabra:palabrasFormadas){
            if (palabra.equalsIgnoreCase(palabraBuscada)) {
                return true;
            }
        }
        return false;
    }
}

package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> listadoPalabras = new ArrayList<>();;

    public Diccionario(ArrayList<String> listadoPalabras){
        setListadoPalabras(listadoPalabras);
    }

    private void setListadoPalabras(ArrayList<String> listadoPalabras){
        for (String palabra: listadoPalabras){
            agregarPalabra(palabra);
        }
    }

    public boolean contiene(String palabraBuscada){
        for (String palabra:listadoPalabras){
            if(palabra.equalsIgnoreCase(palabraBuscada)){
                return true;
            }
        }
        return false;
    }

    public void agregarPalabra(String palabra){
        if (!contiene(palabra)){
            this.listadoPalabras.add(palabra);
        }
    }
}

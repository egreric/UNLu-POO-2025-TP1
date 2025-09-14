package ar.edu.unlu.poo.tp1.ej12y13;

import ar.edu.unlu.poo.tp1.ej10.Tarea;

import java.util.ArrayList;

public class Colaborador {
    private String nombre;
    private ArrayList<Tarea> tareasRealizadas;

    public Colaborador(String nombre){
        setNombre(nombre);
        tareasRealizadas = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void agregarTareaRealizada(Tarea tarea){
        tareasRealizadas.add(tarea);
    }

    public String listadoTareasRealizadas(){
        String listado = "Tareas realizadas por: " + getNombre() + "\n" ;
        for (Tarea t:tareasRealizadas){
            listado += t.mostrarTarea() + " - Completada el: " + t.getFechaCompletada() + "\n";
        }
        return listado;
    }
}

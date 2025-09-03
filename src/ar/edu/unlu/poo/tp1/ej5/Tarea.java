package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Boolean completa = false;
    private LocalDate fechaLimite = null;


    public Tarea(String descripcion, Prioridad prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public Tarea(String descripcion, Prioridad prioridad, LocalDate fechaLimite){
        this(descripcion, prioridad);
        this.fechaLimite = fechaLimite;
    }

    public void cambiarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void cambiarPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void completar(){
        this.completa = true;
    }

    public String mostrarTarea(){
        String estado = "";
        if (estaCompleta()){
            estado += "(Completa) ";
        } else if (estaVencida()){
                estado += "(Vencida) ";
        } else {
                estado += "(Incompleta) ";
        }
        return estado + descripcion;
    }

    public Boolean estaCompleta(){
        return this.completa;
    }

    public Boolean estaVencida(){
        return fechaLimite != null && !estaCompleta() && LocalDate.now().isAfter(fechaLimite);
    }

}

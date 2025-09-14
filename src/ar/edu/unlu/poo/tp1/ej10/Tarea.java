package ar.edu.unlu.poo.tp1.ej10;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Boolean completa = false;
    private LocalDate fechaLimite = null;
    private LocalDate fechaRecordatorio = null;


    public Tarea(String descripcion, Prioridad prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public Tarea(String descripcion, Prioridad prioridad, LocalDate fechaLimite){
        this(descripcion, prioridad);
        this.fechaLimite = fechaLimite;
    }

    public Tarea(String descripcion, Prioridad prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        this(descripcion, prioridad, fechaLimite);
        this.fechaRecordatorio = fechaRecordatorio;
        if (estaPorVencer()){
            cambiarPrioridad(Prioridad.ALTA);
        }
    }

    public void cambiarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void cambiarPrioridad(Prioridad prioridad) {
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
        } else if (estaPorVencer()){
            estado += "(Por Vencer) ";
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

    public boolean estaPorVencer(){
        return fechaRecordatorio != null && !estaCompleta() && !estaVencida() && !LocalDate.now().isBefore(fechaRecordatorio);
    }
}

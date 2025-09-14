package ar.edu.unlu.poo.tp1.ej10;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Boolean completa = false;
    private LocalDate fechaLimite = null;
    private LocalDate fechaRecordatorio = null;
    private LocalDate fechaFinalizacion;


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

    public String getFechaCompletada() {
        if (estaCompleta()){
            return fechaFinalizacion.toString();
        }
        return "";
    }

    public void cambiarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void cambiarPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void completar() {
        this.fechaFinalizacion = LocalDate.now();
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

    public boolean estaCompleta() {
        return this.fechaFinalizacion != null;
    }

    public Boolean estaVencida(){
        return fechaLimite != null && !estaCompleta() && LocalDate.now().isAfter(fechaLimite);
    }

    public boolean estaPorVencer(){
        return fechaRecordatorio != null && !estaCompleta() && !estaVencida() && !LocalDate.now().isBefore(fechaRecordatorio);
    }

    public String getTitulo(){
        return this.descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
}

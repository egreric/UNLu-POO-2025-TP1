package ar.edu.unlu.poo.tp1.ej12y13;

import ar.edu.unlu.poo.tp1.ej10.Prioridad;
import ar.edu.unlu.poo.tp1.ej10.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class AdministradorTareas {
    private ArrayList<Tarea> listadoTareas;
    private ArrayList<Colaborador> listadoColaboradores;

    public AdministradorTareas(){
        listadoTareas = new ArrayList<>();
        listadoColaboradores = new ArrayList<>();
    }

    public void crearTarea(String tituloTarea, Prioridad prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        listadoTareas.add(new Tarea(tituloTarea,prioridad,fechaLimite,fechaRecordatorio));
    }

    private ArrayList<Tarea> generarListaOrdenada(){
        ArrayList<Tarea> listado = (ArrayList<Tarea>) this.listadoTareas.clone();
        Comparator<Tarea> comparadorA = Comparator.comparing(Tarea::getPrioridad).reversed();
        Comparator<Tarea> comparadorB = comparadorA.thenComparing(Comparator.comparing(Tarea::getFechaLimite));
        listado.sort(comparadorB);
        return listado;
    }

    public String getListadoTareasNoVencidasOrdenado() {
        String listado = "";
        ArrayList<Tarea> listadoOrdenado = generarListaOrdenada();
        for (Tarea t: listadoOrdenado){
            if (!t.estaVencida() && !t.estaCompleta()) {
                listado += t.mostrarTarea() + " - Prioridad: " + t.getPrioridad() +
                        " - Fecha Venc.: " + t.getFechaLimite() +"\n";
            }
        }
        return listado;
    }

    public String getListadoNormal() {
        String listado = "";
        for (Tarea t: listadoTareas){
            listado += t.mostrarTarea() + " - Prioridad: " + t.getPrioridad() +
                    " - Fecha Venc.: " + t.getFechaLimite() +"\n";
        }
        return listado;
    }

    // Si este metodo devuelve -1 quiere decir que encontro la tarea
    public String buscarTareaPorTitulo(String titulo){
        int posicionTareaAMostrar = buscaPoscionTareaPorTitulo(titulo);
        if (posicionTareaAMostrar != -1){
            return listadoTareas.get(posicionTareaAMostrar).mostrarTarea();
        } else {
            return "No se encontro Tarea.";
        }
    }

    private int buscaPoscionTareaPorTitulo(String titulo){
        for (Tarea t: listadoTareas){
            if (t.getTitulo().equalsIgnoreCase(titulo)){
                return listadoTareas.indexOf(t);
            }
        }
        return -1;
    }

    public void completarTarea(String titulo){
        int posiscionTareaACompletar = buscaPoscionTareaPorTitulo(titulo);
        if (posiscionTareaACompletar != -1){
            listadoTareas.get(posiscionTareaACompletar).completar();
        }
    }

    public void completarTarea(int posicion){
        if (posicionValida(posicion)){
            listadoTareas.get(posicion-1).completar();
        }
    }

    public void completarTarea(int posicion, String nombre){
        if (posicionValida(posicion)){
            Tarea tareaACompletar = listadoTareas.get(posicion-1);
            tareaACompletar.completar();

            Colaborador colaborador = buscaColaborador(nombre);

            if (colaborador == null){
                colaborador = new Colaborador(nombre);
                listadoColaboradores.add(colaborador);
            }
            colaborador.agregarTareaRealizada(tareaACompletar);
        }
    }

    private Colaborador buscaColaborador(String nombre) {
        for (Colaborador c:listadoColaboradores){
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return c;
            }
        }
        return null;
    }

    private boolean posicionValida(int posicion) {
        return (posicion-1) >= 0 && (posicion-1) < listadoTareas.size();
    }

    public String getListadoPorColaborador(String nombre){
        Colaborador c = buscaColaborador(nombre);
        if (c != null){
            return c.listadoTareasRealizadas();
        }
        return "No hay nada que mostrar";
    }

    public String getListadoColaboradores() {
        String s = "";
        for(Colaborador c:listadoColaboradores){
            s += c.getNombre() + "\n";
        }
        return s;
    }
}

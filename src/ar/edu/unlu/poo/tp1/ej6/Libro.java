package ar.edu.unlu.poo.tp1.ej6;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int cantidadPaginas;
    private int cantidadEjemplares;
    private int cantidadEjemplaresPrestados;

    public Libro(String titulo, String autor, String ISBN, int cantidadPaginas, int cantidadEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidadPaginas = cantidadPaginas;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadEjemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int cantidadPaginas, int cantidadEjemplares) {
        this(titulo,autor,"",cantidadPaginas,cantidadEjemplares);
    }

    public boolean prestar(){
        if (getCantidadEjemplaresDisponibles() > 1){
            cantidadEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver(){
        if (getCantidadEjemplaresPrestados() > 0){
            cantidadEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    public String mostrarDescripcion(){
        return "El libro ´" + getTitulo() +
                "´, Creado por el autor ´" + getAutor() +
                "´, tiene " + getCantidadPaginas() + " paginas." +
                " queda/n " + getCantidadEjemplaresDisponibles() + " ejemplares disponibles" +
                " y se prestaron " + getCantidadEjemplaresPrestados() + " ejemplares." ;
    }

    private int getCantidadEjemplaresDisponibles() {
        return getCantidadEjemplares() - getCantidadEjemplaresPrestados();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public int getCantidadEjemplaresPrestados() {
        return cantidadEjemplaresPrestados;
    }
}

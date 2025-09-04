package ar.edu.unlu.poo.tp1.ej6;

import java.util.ArrayList;

public class MainEj6 {
    public static void main(String[] args) {
        System.out.println("---------- CARGA DE LIBROS Y COMPARACION DE CANTIDAD DE PAGINAS ----------");

        Libro libro1 = new Libro("El Alquimista", "Paulo Cohelo", 525, 10);
        Libro libro2 = new Libro("El Resplandor", "Stephen King", "234123FB42", 634, 1);
        System.out.println(libro1.mostrarDescripcion());
        System.out.println(libro2.mostrarDescripcion() + "\n");

        if (libro1.getCantidadPaginas() > libro2.getCantidadPaginas()) {
            System.out.println("El libro '" + libro1.getTitulo() + "'(" + libro1.getCantidadPaginas() + " paginas) " +
                    "Tiene mas paginas que '" + libro2.getTitulo() + "'(" + libro2.getCantidadPaginas() + " paginas.");
        } else {
            System.out.println("El libro '" + libro2.getTitulo() + "'(" + libro2.getCantidadPaginas() + " paginas) " +
                    "Tiene mas paginas que '" + libro1.getTitulo() + "'(" + libro1.getCantidadPaginas() + " paginas).\n");
        }

        // Agrego libros a una lista
        ArrayList<Libro> listadoLibros = new ArrayList<Libro>();
        listadoLibros.add(libro1);
        listadoLibros.add(libro2);

        System.out.println("---------- PRESTADO DE LIBROS ----------");
        for (Libro l : listadoLibros) {
            if (l.prestar()) {
                System.out.println("Libro prestado!");
            } else {
                System.out.println("El libro '" + l.getTitulo() + "' NO ha sido prestado!, no quedan ejemplares disponibles");
            }
            System.out.println(l.mostrarDescripcion() + "\n");
        }

        System.out.println("---------- DEVOLUCION DE LIBROS ----------");
        for (Libro l : listadoLibros) {
            l.devolver();
            System.out.println(l.mostrarDescripcion());
        }

        System.out.println("\n---------- MUESTRO CANTIDAD DE PRESTAMOS TOTALES ----------");
        // Creo un nuevo libro y hago prestamos de prueba de distintos libros
        Libro libro3 = new Libro("Subiendo la cima","Carlos Sanchez",540,5);
        libro1.prestar();libro1.prestar();libro1.prestar();libro1.prestar(); // Presto 4 veces el libro 1
        libro3.prestar();libro3.prestar(); // Presto 2 veces el libro 3
        listadoLibros.add(libro3); // Agrego el nuevo libro a mi lista para contabilizar los prestamos totales
        int totalPrestamos = 0;
        for (Libro l : listadoLibros) {
            totalPrestamos += l.getCantidadEjemplaresPrestados();
        }
        System.out.println("Entre todos los libros, actualmente hay prestados: " + totalPrestamos + " libros.");
    }
}

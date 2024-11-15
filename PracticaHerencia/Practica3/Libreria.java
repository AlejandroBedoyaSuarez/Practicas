package Practica3;
import java.util.ArrayList;

class Libreria {
    private ArrayList<Libro> libros;

    // Constructor de la clase Libreria
    public Libreria() {
        libros = new ArrayList<>();
    }

    // Método para añadir un libro a la librería
    public void añadirLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro añadido: " + libro.getTitulo());
    }

    // Método para eliminar un libro por título
    public void eliminarLibro(String titulo) {
        boolean encontrado = false; // Flag para verificar si el libro fue encontrado
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro eliminado: " + libros.get(i).getTitulo());
                libros.remove(i); // Eliminar libro por índice
                encontrado = true; // Cambia el flag a true si el libro fue eliminado
                break; // Sale del bucle después de eliminar
            }
        }
        if (!encontrado) { // Si el libro no fue encontrado
            System.out.println("Libro no encontrado: " + titulo);
        }
    }

    // Método para listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La librería está vacía.");
        } else {
            System.out.println("Libros en la librería:");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }
}
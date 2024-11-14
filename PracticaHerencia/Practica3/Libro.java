package Practica3;
import java.util.ArrayList;
class Libro {
    private String titulo;
    private String autor;
    private double precio;

    // Constructor de la clase Libro
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar detalles del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Precio: $" + precio);
    }
}

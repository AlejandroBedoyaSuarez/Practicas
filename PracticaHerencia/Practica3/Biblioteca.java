package Practica3;
class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 15.99);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 20.50);
        Libro libro3 = new Libro("1984", "George Orwell", 18.75);

        libreria.añadirLibro(libro1);
        libreria.añadirLibro(libro2);
        libreria.añadirLibro(libro3);

        System.out.println("\nListado de libros en la librería:");
        libreria.listarLibros();

        System.out.println("\nEliminando el libro '1984':");
        libreria.eliminarLibro("1984");

        System.out.println("\nListado de libros después de eliminar uno:");
        libreria.listarLibros();
    }
}
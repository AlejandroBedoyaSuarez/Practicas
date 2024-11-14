package Practica2;

class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Javier", 29, "Lenguaje de Programación");
        Estudiante estudiante = new Estudiante("Alejandro", 19, "Segundo Año");

        System.out.println("Detalles del Profesor:");
        profesor.visualizarInfo();

        System.out.println("\nDetalles del Estudiante:");
        estudiante.visualizarInfo();
    }
}
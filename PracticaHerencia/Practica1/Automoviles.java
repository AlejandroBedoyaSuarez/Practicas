package Practica1;

class Main {
    public static void main(String[] args) {
        Motor motorCoche = new Motor("Gasolina", 150);
        Coche coche = new Coche("Toyota", "Corolla", motorCoche, 4);

        Motor motorMoto = new Motor("Gasolina", 80);
        Motocicleta moto = new Motocicleta("Yamaha", "YZF", motorMoto, false);

        System.out.println("Información del coche:");
        coche.mostrarInfo();

        System.out.println("\nInformación de la motocicleta:");
        moto.mostrarInfo();
    }
}
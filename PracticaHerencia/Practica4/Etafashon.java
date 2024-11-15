package Practica4;

class Main {
    public static void main(String[] args) {
        Electronico laptop = new Electronico("Lenovog40", 1200.45, "12345tuñaña", true);
        Ropa pantalon = new Ropa("Camiseta", 50.80, "tuñañaeshombre", 4);

        System.out.println("Información del Producto Electrónico: ");
        laptop.mostrarInformasao();
        System.out.println("Información del Producto Ropa: ");
        pantalon.mostrarInformasao();

    }
}
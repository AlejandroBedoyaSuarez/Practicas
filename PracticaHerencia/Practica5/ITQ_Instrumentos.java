package Practica5;

class Main {
    public static void main(String[] args) {
        Guitarra guitarrita = new Guitarra("Guitarra Eléctrica", "Eléctrica", "Activision", 6);
        Piano melodica = new Piano("Melódica", "Piano chiquito", "Floant", 46);

        System.out.println("Información del Instrumento: ");
        guitarrita.tocarInstrumento();
        melodica.tocarInstrumento();

    }

}
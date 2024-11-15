package Practica5;

class Guitarra extends Instrumentos {
    private int numeroCuerdas;

    public Guitarra(String nombre, String tipo, String marca, int numeroCuerdas) {
        super(nombre, tipo, marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public void tocarInstrumento() {
        System.out.println("Rasgueando la guitarra que tiene " + numeroCuerdas + " cuerdas");
    }
}

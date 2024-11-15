package Practica5;

class Piano extends Instrumentos {
    private int numTeclas;

    public Piano(String nombre, String tipo, String marca, int numTeclas) {
        super(nombre, tipo, marca);
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public void tocarInstrumento() {
        System.out.println("Carreando pa con " + numTeclas + " teclas");
    }
}

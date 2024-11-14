package Practica1;

class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, Motor motor, int numPuertas) {
        super(marca, modelo, motor); // Llama al constructor de la clase base
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
    }
}

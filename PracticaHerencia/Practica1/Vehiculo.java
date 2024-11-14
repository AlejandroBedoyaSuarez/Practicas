package Practica1;

// Clase base Vehiculo
class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor; // Composición (colaboración entre clases)

    // Constructor
    public Vehiculo(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor Tipo: " + motor.getTipo() + ", Potencia: " + motor.getPotencia() + "HP");
    }
}

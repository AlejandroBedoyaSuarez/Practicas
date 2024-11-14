package Practica1;
class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, Motor motor, boolean tieneSidecar) {
        super(marca, modelo, motor);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

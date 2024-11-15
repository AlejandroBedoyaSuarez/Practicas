package Practica4;

class Electronico extends Producto{
    private boolean garantia;

    public Electronico(String nombre, double precio, String codigo, boolean garantia){
        super(nombre, precio, codigo);
        this.garantia= garantia;
    }

    public boolean isTieneGarantia(){
        return garantia;
    }

    public void setTieneGarantia(boolean garantia){
        this.garantia= garantia;
    }

    @Override
    public void mostrarInformasao(){
        super.mostrarInformasao();
        System.out.println("¿Tiene garantía : " + (garantia ? "Si" : "No"));
    }
}

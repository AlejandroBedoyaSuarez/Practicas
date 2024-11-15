package Practica4;

class Ropa extends Producto{
    private int talla;

    public Ropa(String nombre, double precio, String codigo, int talla){
        super(nombre, precio, codigo);
        this.talla= talla;
    }

    public int getTalla(){
        return talla;
    }

    public void setTalla(int talla){
        this.talla= talla;
    }

    @Override
    public void mostrarInformasao(){
        super.mostrarInformasao();
        System.out.println("La talla del producto es : " + talla);
    }
}

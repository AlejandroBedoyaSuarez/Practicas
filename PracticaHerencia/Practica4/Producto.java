package Practica4;

class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio= precio;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo= codigo;
    }

    public void mostrarInformasao(){
        System.out.println("El nombre del producto es : " + nombre);
        System.out.println("El precio del producto es: " + precio);
        System.out.println("El código del producto es: " + codigo);
    }

}
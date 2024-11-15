package Practica7;

class Cliente extends Usuario{
    private String direccionEntrega;

    public Cliente(String nombre, String correo, String contraseña, String direccionEntrega){
        super(nombre, correo, contraseña);
        this.direccionEntrega= direccionEntrega;
    }

    public String getDireccionEntrega(){
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega){
        this.direccionEntrega=direccionEntrega;
    }

    public void mostrarPerfil(){
        System.out.println("El usuario con la identidad de : " + "Nombre : "+ nombre + "Correo:" +correo + "Quiere hacer una dirección de entrega a :" + direccionEntrega);
    }
}

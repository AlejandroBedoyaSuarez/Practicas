package Practica7;

class Usuario{
    protected String nombre;
    protected String correo;
    protected String contraseña;

    public Usuario(String nombre, String correo, String contraseña){
        this.nombre= nombre;
        this.correo= correo;
        this.contraseña= contraseña;
    }

    public String getNivelAccesso(){
        return nombre;
    }
    
    public void setNivelAccesso(String nombre){
        this.nombre= nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo= correo;
    }

    public String getContraseña(){
        return contraseña;
    }

    public void setContraseña(String contraseña){
        this.contraseña= contraseña;
    }
    

    public void mostrarPerfil(){
        System.out.println("El usuario " + nombre + " tiene como perfil de usuario : " + "Correo : " + correo + " y su contraseña es : " + contraseña);
    }
}
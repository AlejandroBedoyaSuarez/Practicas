package Practica7;

class Administrador extends Usuario{
    private String nivelAcceso;

    public Administrador(String nombre, String correo, String contraseña, String nivelAcceso){
        super(nombre, correo, contraseña);
        this.nivelAcceso= nivelAcceso;
    }

    public String getNivelAcesso(){
        return nivelAcceso;
    }

    public void setNivelAcesso(String nivelAcceso){
        this.nivelAcceso= nivelAcceso;
    }

    public void mostrarPerfil(){
        System.out.println("El usuario " + nombre + "ingreso a nuestra institución como administrador con las credenciales : " + "Correo:" + correo + "Contraseña: " + contraseña + "y su nivel de acceso requerido es : " + nivelAcceso);
    }
}
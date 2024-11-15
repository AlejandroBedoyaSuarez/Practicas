package Practica6;

class Doctor extends Persona{
    private String especialidad;

    public Doctor(String nombre, String apellido, int edad, String genero, String especialidad){
        super(nombre, apellido, edad, genero);
        this.especialidad= especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad= especialidad;
    }

   public void mostrarInfo(){
    System.out.println("El doctor " + nombre + apellido + " es especialista en " + especialidad);
   }
}
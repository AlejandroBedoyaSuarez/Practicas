package Practica6;

class Enfermo extends Persona{
    private String turno;

    public Enfermo(String nombre, String apellido, int edad, String genero, String turno ){
        super(nombre, apellido, edad, genero);
        this.turno=turno;
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno=turno;
    }

    public void mostrarInfo(){
        System.out.println("Se registra un nuevo enfermo llamado : " + nombre + apellido + " con la edad de  " + edad + " genero " + genero + " y su turno es en horario : " + turno);
    }
}
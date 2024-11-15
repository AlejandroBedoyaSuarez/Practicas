package Practica6;

class Paciente extends Persona{
    private String diagnostico;

    public Paciente(String nombre, String apellido, int edad, String genero, String diagnostico){
        super(nombre, apellido, edad, genero);
        this.diagnostico=diagnostico;
    }

    public String getDiagnostico(){
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico){
        this.diagnostico= diagnostico;
    }

    public void mostrarInfo(){
        System.out.println("El paciente " + nombre + apellido + " de " + edad + " años de edad, tiene el diagnostico : " + diagnostico);
    }
}

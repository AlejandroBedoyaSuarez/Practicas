package Practica2;

class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, int edad, String curso){
        super(nombre, edad);
        this.curso= curso;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso= curso;
    }

    @Override
    public void visualizarInfo(){
        super.visualizarInfo();
        System.out.println("El curso es : " + curso);
    }
}

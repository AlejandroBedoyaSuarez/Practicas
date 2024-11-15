package Practica6;

class Main{
    public static void main(String[] args) {
        
        Doctor otorrino = new Doctor("Ramiro", "Yepez", 64, "masculino", "Otorrinolaringólogo");
        Paciente jovenPaciente= new Paciente("Alejandro", "Bedoya", 19, "masculino", "dolor en las articulaciones/Gripe");
        Enfermo jovenDia= new Enfermo("Melody", "Villacis", 21, "femenino", "matutino");
        Enfermo jovenNoche= new Enfermo("Adrian", "Falcones", 21, "masculino", "nocturno");
    
        System.out.println("Información del Doctor: ");
        otorrino.mostrarInfo();
        System.out.println("Información del Paciente: ");
        jovenPaciente.mostrarInfo();
        System.out.println("Información de la primera persona enferma: ");
        jovenDia.mostrarInfo();
        System.out.println("Información de la segunda persona enferma: ");
        jovenNoche.mostrarInfo();
    
    }
}

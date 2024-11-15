package Practica7;

class ITQ{
    public static void main(String[] args) {
        Administrador developerJunior= new Administrador("Alejandro", "kiritokunp23@gmail.com", "admin2233", "Administrador");
        Cliente clienteFrecuente= new Cliente("Melody", "melody@itq.edu.ec", "cliente2233", "Centro Comercial El Jardin, entrada Norte");
    
        System.out.println("Información del Administrador : ");
        developerJunior.mostrarPerfil();
        System.out.println("Información del Cliente: ");
        clienteFrecuente.mostrarPerfil();
    
    }
}

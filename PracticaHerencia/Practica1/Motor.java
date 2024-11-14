package Practica1;

// Clase Motor
class Motor {
    private String tipo;
    private int potencia;

    // Constructor
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    // Getters y Setters

   // Método getTipo(): Devuelve el valor del atributo tipo.
    public String getTipo() {
        return tipo;
    }
    //Método setTipo(String tipo): Permite asignar un valor al atributo tipo.
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //getPotencia devuelve el valor del atributo potencia
    public int getPotencia() {
        return potencia;
    }
    //Permite asignar un valor al atributo potencia
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}

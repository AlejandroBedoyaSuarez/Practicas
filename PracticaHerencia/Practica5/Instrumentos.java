package Practica5;

class Instrumentos {
    private String nombre;
    private String tipo;
    private String marca;

    public Instrumentos(String nombre, String tipo, String marca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void tocarInstrumento() {
        System.out.println("Tocando Instrumento" + nombre + " que es " + tipo + " y su marca es " + marca);
    }
}

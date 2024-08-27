package models;
/*
* Clase Persona
* */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int peso;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }

    /*public Persona(String nombre, String apellido, int edad, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }*/



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //@Override
    public String mostrar() {
        return "Datos Persona\n" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", peso=" + peso;
    }

    /**
     * Aumentar Peso
     * **/

    public void aumentarPeso(double aumento){
        this.peso += aumento;
    }

    /**
     * Disminuir Peso
     * **/

    public void disminuirPeso(double disminuir){
        this.peso -= disminuir;
    }

}


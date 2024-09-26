package models;

public class Animal {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void eat(){
        System.out.println("The animal is eating.");

    }

    public void myName(){
        System.out.println("My name is " + nombre + ".");
    }

}


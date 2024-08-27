// Ejercicio 1

import models.Persona;

import java.util.Arrays;
import java.util.Scanner;
//Los paquetes estan siempre en minuscula y las clases estan siempre en mayusculas
/**
Comentario Java Doc
Sirve para la documentacion
**/


public class Main {
    public static void main(String[] args) { //Static significa que puede ser ejecutada sin necesidad de instanciarla

        Scanner sc = new Scanner(System.in);
        /*
        //System.out.println("Hello world!");

        // Datos Primitivos y Por Referencia

        //Datos Primitivos
        int num = 13;
        float precio = 99.99F; //Para identificar que es float es necesario poner la F
        double desc = 1.5;
        String nombre;
        nombre = "Cesar";
        char caracter = 'a';

        System.out.println(num); //Println hace salto de linea
        System.out.println("Precio: " + precio); //Print no hace salto de linea
        System.out.println("Desc: " + desc);
        System.out.println()    ;
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.mostrar();
        */

        //Primer persona va a ser el tipo de dato y Persona() es el constructor

        //Los objetos siempre van en minuscula

        Persona karen = new Persona();
        Persona cesar = new Persona();
        Persona silvio;

        silvio = new Persona("Silvio", "Mora", 20, 150);


        karen.setNombre("Karen");
        karen.setApellido("Fonseca");
        karen.setEdad(20);
        karen.setPeso(110);

        System.out.println("Dime tu nombre: ");
        cesar.setNombre(sc.nextLine());

        System.out.println("Dime tu apellido: ");
        cesar.setApellido(sc.nextLine());

        System.out.println("Dime tu peso: ");
        cesar.setPeso(sc.nextInt());

        System.out.println("Dime la edad: ");
        cesar.setEdad(sc.nextInt());

        System.out.println(karen.mostrar());
        System.out.println(cesar.toString());
        //System.out.println(silvio);

        karen.aumentarPeso(10);
        cesar.disminuirPeso(10);

        System.out.println(cesar);
        System.out.println(karen);

    }
}

class Ejercicio2{
    public  void mostrar() {

        //Esto es una variable por referencia
        Scanner sc = new Scanner(System.in);

        //Clase hecha para poder leer desde consola
        //No tiene que ser sc necesariamente puede ser cualquier cosa que yo quiera

        String name;
        int edad;

        System.out.println("Dime tu nombre: ");
        name = sc.nextLine();
        System.out.println("Hola " + name + " mucho gusto");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Tienes " + edad + " anios");
    }
}


import models.Student;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int opc = 0;

        while (opc != 6) {

            System.out.println("~ Seleccione su Opcion ~");
            System.out.println();
            System.out.println("1. Ejercicio 1 - Clases Estudiantes.");
            System.out.println("2. Num. Par e Impares.");
            System.out.println("3. Grados Celsius a Fahrenheit.");
            System.out.println("4. Mayor de Tres Numeros.");
            System.out.println("5. Area de un Circulo.");
            System.out.println();
            System.out.print("-> "); opc = sc.nextInt();

            switch (opc) {
                case 1:
                    main.ejercicio1();
                    break;

                case 2:
                    main.ejercicio2();
                    break;

                case 3:
                    main.ejercicio3();
                    break;

                case 4:
                    main.ejercicio4();
                    break;

                case 5:
                    main.ejercicio5();
                    break;

                case 6:
                    System.out.println("Adioooos");
                    break;

                default:
                    System.out.println("Noooooooooooooooooooo");
                    break;
            }

        }

    }


    public void ejercicio1(){

        Scanner sc = new Scanner(System.in);
        Student cesar = new Student();

        System.out.println();
        System.out.println("~ UAM ~");
        System.out.println();

        System.out.print("Ingrese su CIF: "); cesar.setCIF(sc.nextLine());
        System.out.print("Ingrese su Nombre: "); cesar.setNombre(sc.nextLine());
        System.out.print("Ingrese su Apellido: "); cesar.setApellido(sc.nextLine());
        System.out.print("Ingrese la Asignatura: "); cesar.setAsignatura(sc.nextLine());
        System.out.print("Nota Primer Corte: "); cesar.setFirstCut(sc.nextInt());
        System.out.print("Nota Segundo Corte: "); cesar.setSecondCut(sc.nextInt());
        System.out.print("Nota Tercer Corte: "); cesar.setThirdCut(sc.nextInt());

        System.out.println();

        System.out.println("Nota Final: " + cesar.obtNotaFinal());
        System.out.println("Resultado: " + cesar.evaluateFinalGrade());
        System.out.println("Convocatoria: " + cesar.evaluateConvo());

    }

    public void ejercicio2(){

        Scanner sc = new Scanner(System.in);

        int evaluNum;
        System.out.print("Ingrese un numero: "); evaluNum = sc.nextInt();
        System.out.println();

        if (evaluNum % 2 == 0){
            System.out.println("El numero " + evaluNum + " es Par.");
        } else System.out.println("El numero " + evaluNum + " es Impar.");

    }

    public void ejercicio3(){

        Scanner sc = new Scanner(System.in);

        float gradosCelsius;

        System.out.print("Ingrese la temperatura en grados Celsius: "); gradosCelsius = sc.nextFloat();

        float gradosFahrenheit = (gradosCelsius * 9/5) + 32;

        System.out.println(gradosCelsius + "° Celsius = " + gradosFahrenheit + "° Fahrenheit");

    }

    public void ejercicio4(){

        Scanner sc = new Scanner(System.in);
        float num1, num2, num3;

        System.out.print("Ingrese el Primer Numero: "); num1 = sc.nextFloat();
        System.out.print("Ingrese el Segundo Numero: "); num2 = sc.nextFloat();
        System.out.print("Ingrese el Tercer Numero: "); num3 = sc.nextFloat();

        float[] numeros = {num1, num2, num3};

        Arrays.sort(numeros);

        float menor = numeros[0];
        float medio = numeros[1];
        float mayor = numeros[2];

        System.out.println("Mayor: " + mayor + " | " + "Medio: " + medio + " | " + "Menor: " + menor);

    }

    public void ejercicio5(){
        Scanner sc = new Scanner(System.in);

        double pi = Math.PI, radio, area;

        System.out.print("Ingrese el Radio de su Circulo: "); radio = sc.nextFloat();

        area = pi * (radio * radio);

        //System.out.println("El Area del Circulo es: " + area );
        System.out.printf("El Area del Circulo es: %.2f %n", area);
    }

}

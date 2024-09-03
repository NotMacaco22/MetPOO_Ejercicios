import models.BankAccount;
import models.Serie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int menuOpc = 0;

        while (menuOpc != 3) {
            System.out.println("\n~ Menu ~\n");
            System.out.println("1. Class Account Practice");
            System.out.println("2. Class Series Practice");
            System.out.println("3. Exit\n");
            System.out.print("->"); menuOpc = sc.nextInt();

            switch (menuOpc) {
                case 1:
                    main.firstExercise();
                    break;
                case 2:
                    main.secondExercise();
                    break;
                case 3:
                    System.out.println("See you");
                    break;
            }

        }

    }


    public void firstExercise(){
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        String name;
        Scanner scName = new Scanner(System.in);

        Double amount = 0.0;
        Scanner scAmount = new Scanner(System.in);

        while (opc != 3){
            System.out.println("Select an Option");
            System.out.println("1. No Initial Amount User");
            System.out.println("2. Normal User");
            System.out.println("3. Exit");
            System.out.print("-> "); opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.print("Account Owner: "); name = scName.nextLine();
                    BankAccount noAmount = new BankAccount(name);

                    noAmount.greeting();
                    noAmount.deposit(100);
                    noAmount.withdraw(100);
                    System.out.println();
                    noAmount.showAmount();
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Account Owner: "); name = scName.nextLine();
                    System.out.print("Initial Amount: "); amount = scAmount.nextDouble();

                    while (amount <= -1) {
                        System.out.println("\nInvalid Amount - Please Try Again");
                        System.out.print("Initial Amount: "); amount = scAmount.nextDouble();
                    }

                    BankAccount account = new BankAccount(name, amount);

                    account.greeting();
                    account.deposit(1000);
                    account.showAmount();
                    System.out.println();
                    account.withdraw(account.getAmount() + 1);
                    account.showAmount();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Goodbyeee");
                    break;

            }
        }
    }

    public void secondExercise(){
        Scanner scanner = new Scanner(System.in);
        Serie.Builder builder = new Serie.Builder();

        System.out.println("~ Series Database ~");
        System.out.println("Complete the next information: ");
        System.out.println();

        System.out.print("Title: ");
        String titulo = scanner.nextLine();
        while (titulo.isEmpty() || titulo.isBlank()) {
            System.out.println();
            System.out.println("Title is a mandatory - Can't be empty- Try Again");
            System.out.print("Title: ");
            titulo = scanner.nextLine();
            System.out.println();
        }
        builder.setTitle(titulo);


        System.out.print("# of Seasons: ");
        String temporadasInput = scanner.nextLine();
        if (!temporadasInput.isEmpty()) {
            int finalSeasons = Integer.parseInt(temporadasInput);
            builder.setTotalSeasons(finalSeasons);}


        System.out.print("Genre: ");
        String genero = scanner.nextLine();
        while (genero.isEmpty() || genero.isBlank()) {
            System.out.println("\nGenre is a mandatory - Can't be empty- Try Again");
            System.out.print("Genre: ");
            genero = scanner.nextLine();
        }
        builder.setGenre(genero);


        System.out.print("Director: ");
        String creador = scanner.nextLine();
        while (creador.isEmpty() || creador.isBlank()) {
            System.out.println("\nDirector is a mandatory - Can't be empty- Try Again");
            System.out.println("Director: ");
            creador = scanner.nextLine();

        }
        builder.setDirector(creador);

        System.out.print("Has the serie been submitted? (true/false): ");
        String entregadoInput = scanner.nextLine();
        if (!entregadoInput.isEmpty()) {
            boolean submittedFinal = Boolean.parseBoolean(entregadoInput);
            builder.setSumbitted(submittedFinal);}

        Serie serie = builder.build();

        System.out.println(serie.toString());


    }

}

package org.cash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Please enter your name: "); name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
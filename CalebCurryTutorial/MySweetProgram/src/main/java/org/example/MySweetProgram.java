package org.example;

import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("Enter your name");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int i = 0;
        do {
            System.out.println("i is: " + i);
            i++;
        } while (i < 10);

        scanner.close();
    }
}
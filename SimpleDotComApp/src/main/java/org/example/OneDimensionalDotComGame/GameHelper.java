package org.example.OneDimensionalDotComGame;

import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + " ");

        String inputLine = scanner.nextLine();

        while (inputLine.length() == 0) {
            System.out.println("empty input. try again once..");
        System.out.print(prompt + " ");
            inputLine = scanner.nextLine();
        }

        return inputLine;
    }
}
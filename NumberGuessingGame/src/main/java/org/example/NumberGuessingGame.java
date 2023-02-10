package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);

        int tryCount = 0;
        while (true) {
            System.out.println("Enter you guess (1-100): ");
            Scanner scanner = new Scanner(System.in);

            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("The number is higher. Guess again");
            } else {
                System.out.println("The number is lower. Guess again");
            }
        }
    }
}
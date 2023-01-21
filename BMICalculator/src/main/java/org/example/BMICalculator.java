package org.example;

//weight (kg) / height (m)^2
//weight (lb) / height (m)^2 * 703

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BMICalculatorApp();
    }

    private static void BMICalculatorApp() {
        double weight = enterNumber("Enter weight in kg: ");
        double height = enterNumber("Enter height cm: ");
        calculateBMI(weight, height);
    }

    private static void calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow((height/100), 2);
        printBMIResult(formatBMIResult(bmi));
    }
    private static String formatBMIResult(double bmi) {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(bmi);
    }

    private static void printBMIResult(String result) {
        System.out.println("Your BMI is: " + result);
    }

    public static double enterNumber(String message) {
        boolean flag = false;
        String value = "";
        double result = 0;
        do {
            System.out.print(message);
            value = scanner.nextLine();
            try {
                result = Double.parseDouble(value);
                flag = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid double.");
            }
        } while (!flag);
        return result;
    }
}
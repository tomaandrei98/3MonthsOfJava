package org.example;

//weight (kg) / height (m)^2
//weight (lb) / height (m)^2 * 703

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
    static Scanner scanner = new Scanner(System.in);

    public void BMICalculatorApp() {
        double weight = enterNumber("Enter weight in kg: ");
        double height = enterNumber("Enter height cm: ");
        calculateBMI(weight, height);
    }

    public double calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow((height/100), 2);
        printBMIResult(formatBMIResult(bmi));
        return bmi;
    }
    public String formatBMIResult(double bmi) {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(bmi);
    }

    public void printBMIResult(String result) {
        System.out.println("Your BMI is: " + result);
    }

    public double enterNumber(String message) {
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
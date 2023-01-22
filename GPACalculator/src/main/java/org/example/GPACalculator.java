package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        // total points / total credits
        // points for a class = grade value * credits
        // A = 4, B = 3..

        Scanner scanner = new Scanner(System.in);

        Integer totalPoints = 0;
        Integer totalCredits = 0;

        boolean moreClasses = false;

        do {
            Integer creditInt = 0;

            boolean validCredits;
            do {
                validCredits = true;
                System.out.print("Enter number of credits: ");
                String credits = scanner.nextLine();
                try {
                    creditInt = Integer.parseInt(credits);
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a valid integer");
                    validCredits = false;
                }
            } while (!validCredits);


            boolean validGrade;

            Integer gradeValue = 0;

            do {
                validGrade = true;
                System.out.print("Enter grade: ");
                String grade = scanner.nextLine();
                if (grade.equalsIgnoreCase("A")) {
                    gradeValue = 4;
                } else if (grade.equalsIgnoreCase("B")) {
                    gradeValue = 3;
                } else if (grade.equalsIgnoreCase("C")) {
                    gradeValue = 2;
                } else if (grade.equalsIgnoreCase("D")) {
                    gradeValue = 1;
                } else if (grade.equalsIgnoreCase("F")) {
                    gradeValue = 0;
                } else {
                    System.out.println("You didn't enter a valid grade :(");
                    validGrade = false;
                }
            } while (!validGrade);

            Integer points = gradeValue * creditInt;
            totalPoints += points;
            totalCredits += creditInt;

            System.out.println("Would you like to enter another class? (y/n)");
            String moreClassesString = scanner.nextLine();
            moreClasses = moreClassesString.equalsIgnoreCase("Y");
        } while (moreClasses);
        DecimalFormat df = new DecimalFormat("0.00");

        double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);

        System.out.println("Total points: " + totalPoints);
        System.out.println("Total credits: " + totalCredits);
        System.out.println("GPA: " + df.format(gpa));
    }
}
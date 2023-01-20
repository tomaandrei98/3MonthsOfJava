package org.example;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[15];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        //sorting algorithm
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("After: ");
        printArray(numbers);

        binarySearchForValue(numbers, 7);
    }

    private static void binarySearchForValue(int[] array, int value) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (array[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if (array[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                System.out.println("Found a match for " + value + " at index " + middleIndex);
                break;
            }
        }
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
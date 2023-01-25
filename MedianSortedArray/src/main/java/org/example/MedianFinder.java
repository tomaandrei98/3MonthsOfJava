package org.example;

public class MedianFinder {

    public static double findMedianSortedArrays(int[] numbers1, int[] numbers2) {
        int[] mergedNumbers = mergeArrays(numbers1, numbers2);

        if (mergedNumbers.length == 0) {
            return 0.0;
        }

        if (mergedNumbers.length % 2 == 1) {
            return mergedNumbers[mergedNumbers.length / 2];
        }

        return ((double) mergedNumbers[mergedNumbers.length / 2] + mergedNumbers[(mergedNumbers.length / 2) - 1]) / 2;
    }

    public static int[] mergeArrays(int[] numbers1, int[] numbers2) {
        int[] mergedNumbers = new int[numbers1.length + numbers2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < numbers1.length && j < numbers2.length) {
            if (numbers1[i] < numbers2[j]) {
                mergedNumbers[k] = numbers1[i];
                i++;
            } else {
                mergedNumbers[k] = numbers2[j];
                j++;
            }
            k++;
        }

        while (i < numbers1.length) {
            mergedNumbers[k] = numbers1[i];
            i++;
            k++;
        }

        while (j < numbers2.length) {
            mergedNumbers[k] = numbers2[j];
            j++;
            k++;
        }
        return mergedNumbers;
    }
}
package org.example;

import java.util.Arrays;

public class MedianFinder {

    private static double findMedianSortedArrays(int[] numbers1, int[] numbers2) {
        int[] mergedNums = mergeArrays(numbers1, numbers2);

        if (mergedNums.length % 2 == 1) {
            return mergedNums[mergedNums.length / 2];
        }

        return 0.0;
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
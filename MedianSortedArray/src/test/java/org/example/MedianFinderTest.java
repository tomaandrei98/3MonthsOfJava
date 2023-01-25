package org.example;

import org.junit.jupiter.api.Test;

import static org.example.MedianFinder.findMedianSortedArrays;
import static org.example.MedianFinder.mergeArrays;
import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {
    @Test
    public void merge() {
        int[] result = mergeArrays(new int[]{1, 3}, new int[]{2});

        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void findMedianSortedArraysOddSizedTest() {
        int[] firstArray = {1, 2};
        int[] secondArray = {3};

        double actualOutput = findMedianSortedArrays(firstArray, secondArray);
        double expectedOutput = 2;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void findMedianSortedArraysEvenSizedTest() {
        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4};

        double actualOutput = findMedianSortedArrays(firstArray, secondArray);
        double expectedOutput = 2.5;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void findMedianSortedArraysOneSizedTest() {
        int[] firstArray = {1};
        int[] secondArray = {};

        double actualOutput = findMedianSortedArrays(firstArray, secondArray);
        double expectedOutput = 1.0;

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void findMedianSortedArraysEmptySizedTest() {
        int[] firstArray = {};
        int[] secondArray = {};

        double actualOutput = findMedianSortedArrays(firstArray, secondArray);
        double expectedOutput = 0.0;

        assertEquals(expectedOutput, actualOutput);
    }
}
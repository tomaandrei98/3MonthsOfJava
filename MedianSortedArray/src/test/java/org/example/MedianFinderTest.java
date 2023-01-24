package org.example;

import org.junit.jupiter.api.Test;

import static org.example.MedianFinder.mergeArrays;
import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {
    @Test
    public void merge() {
        int[] result = mergeArrays(new int[]{1, 3}, new int[]{2});

        assertArrayEquals(new int[]{1, 2, 3}, result);
    }
}
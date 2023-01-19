package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        heapSort(numbers);

        System.out.println("After: ");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = minHeap.poll();
        }
    }
}

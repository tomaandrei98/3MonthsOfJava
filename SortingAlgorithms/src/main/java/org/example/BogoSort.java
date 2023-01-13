package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numberList.add(rand.nextInt(10000));
        }

        //shuffle the list and verify if the elements are in order
        while (!isListSorted(numberList)) {
            Collections.shuffle(numberList);
        }

        numberList.forEach(System.out::println);
    }

    private static boolean isListSorted(List<Integer> numberList) {
        if (numberList == null) {
            return true;
        }

        int length = numberList.size();
        if (length <= 1) {
            return true;
        }

        for (int i = 0; i < length-1; i++) {
            if (numberList.get(i) > numberList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        List<List<Integer>> permutations = permute(numbers);
        System.out.println(permutations);
    }

    public static List<List<Integer>> permute(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        boolean[] map = new boolean[numbers.length];
        helper(numbers, result, map, sub);
        return result;
    }

    private static void helper(int[] numbers, List<List<Integer>> result, boolean[] map, List<Integer> sub) {
        if (sub.size() == numbers.length) {
            result.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!map[i]) {
                sub.add(numbers[i]);
                map[i] = true;
                helper(numbers, result, map, sub);
                sub.remove(sub.size() - 1);
                map[i] = false;
            }
        }
    }
}
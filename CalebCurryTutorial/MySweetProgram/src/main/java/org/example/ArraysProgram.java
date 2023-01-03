package org.example;

public class ArraysProgram {
    public static void main(String[] args) {
        int[][] data = {
                {4, 6, 3, 10},
                {4, 2, 40, 1},
                {5, 34, 1, 43}
        };

        data[1][2] = 49;
        System.out.println(data[1][2]);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

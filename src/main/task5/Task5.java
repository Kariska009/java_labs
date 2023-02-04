package main.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] A = new int[25];

        for (int i = 0; i < 25; i++) {
            A[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
}

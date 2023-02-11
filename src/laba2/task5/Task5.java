package laba2.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(B));
        Arrays.sort(B);
        System.out.println(Arrays.toString(B));
    }
}

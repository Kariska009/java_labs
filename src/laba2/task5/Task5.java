package laba2.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] b = new int[25];

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}

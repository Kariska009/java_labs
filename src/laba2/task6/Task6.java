package laba2.task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] c = new int[20];

        for (int i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(c));
        System.out.println(average(c));
    }

    static double average(int[] C) {
        double average = 0;

        for (int number : C) {
            average += number;
        }

        return average / C.length;
    }
}

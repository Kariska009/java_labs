package laba2.task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] C = new int[20];

        for (int i = 0; i < C.length; i++) {
            C[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(C));
        System.out.println(average(C));
    }

    static double average(int[] C) {
        double average = 0;

        for (int number : C) {
            average += number;
        }

        return average / C.length;
    }
}

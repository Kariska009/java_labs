package main.task4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] A = new int[25];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(A));
        swapMaxMinElements(A);
        System.out.println(Arrays.toString(A));

        System.out.println(getMaxElement(A));
    }

    static void swapMaxMinElements(int[] A) {
        int maxIndex = 0;
        int maxElement = A[0];
        int minIndex = 0;
        int minElement = A[0];

        for (int i = 1; i < A.length; i++) {
            if (maxElement < A[i]) {
                maxIndex = i;
                maxElement = A[i];
            }
            if (minElement > A[i]) {
                minIndex = i;
                minElement = A[i];
            }
        }

        System.out.println("max index: " + maxIndex);
        System.out.println("min index: " + minIndex);

        int temp = maxElement;
        A[maxIndex] = minElement;
        A[minIndex] = temp;
    }

    static int getMaxElement(int[] A) {
        int maxElement = A[0];

        for (int i = 1; i < A.length; i++) {
            if (maxElement < A[i]) {
                maxElement = A[i];
            }
        }

        return maxElement;
    }
}

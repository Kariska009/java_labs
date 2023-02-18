package laba2.task4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] a = new int[25];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(a));
        int maxIndex = findMaxIndex(a);
        int minIndex = findMinIndex(a);
        System.out.println("Max index = " + maxIndex + ", " + "min index = " + minIndex);
        swapElementsByIndex(a, maxIndex, minIndex);
        System.out.println(Arrays.toString(a));

        System.out.println(findMaxElement(a));
    }
    static int findMaxIndex(int[] a) {
        int maxElementIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[maxElementIndex] < a[i]) {
                maxElementIndex = i;
            }
        }

        return maxElementIndex;
    }

    static int findMinIndex(int[] a) {
        int minElementIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[minElementIndex] > a[i]) {
                minElementIndex = i;
            }
        }

        return minElementIndex;
    }

    static int findMaxElement(int[] a) {
        int maxElement = a[0];

        for (int i = 1; i < a.length; i++) {
            if (maxElement < a[i]) {
                maxElement = a[i];
            }
        }

        return maxElement;
    }

    static void swapElementsByIndex(int[] a, int firstIndex, int secondIndex) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
}

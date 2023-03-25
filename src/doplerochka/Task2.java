package doplerochka;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));
        int minFirstIndex = findMinElementIndex(arr);
        int minLastIndex = findMinMaxElementIndex(arr, minFirstIndex);

        if (minFirstIndex == minLastIndex) {
            System.out.println("0");
        } else {
            System.out.println("Количество элементов между первым и последних минимальным элементом: " + (minLastIndex - minFirstIndex - 1));
        }

    }

    private static int findMinElementIndex(int[] arr) {
        int minElementIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[minElementIndex] > arr[i]) {
                minElementIndex = i;
            }
        }

        return minElementIndex;
    }

    private static int findMinMaxElementIndex(int[] arr, int minFirstElementIndex) {
        int element = arr[minFirstElementIndex];
        int minMaxElementIndex = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == element) {
                minMaxElementIndex = i;
                break;
            }
        }

        return minMaxElementIndex;
    }

}

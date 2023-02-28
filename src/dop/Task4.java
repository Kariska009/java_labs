package dop;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] a = new int[m][n];
        int count = 0;
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(10);
            }
        }

        for (int[] ints : a) {
            for (int number : ints) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                temp[j] = a[i][j];
            }
            if (hasUniqueElements(temp)) {
                count++;
            }
        }

        System.out.println("Количество строк без повторений чисел = " + count);
    }

    static boolean hasUniqueElements(int[] array) {
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                return false;
            }
        }

        return true;
    }

}

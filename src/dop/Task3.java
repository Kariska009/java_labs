package dop;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] a = new int[m][n];
        int[][] b = new int[2][m];
        int[] sumRows = new int[m];
        int indexMaxRow = 0;
        int indexMinRow = 0;
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(50);
            }
        }

        printArray(a);

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            sumRows[i] = sum;
        }


        for (int i = 1; i < m; i++) {
            if (sumRows[i - 1] < sumRows[i]) {
                indexMaxRow = i;
            }
            if (sumRows[i - 1] > sumRows[i]) {
                indexMinRow = i;
            }
        }

        System.out.println("Строка с максимальной суммой: " + Arrays.toString(a[indexMaxRow]));
        System.out.println("Строка с минимальной суммой: " + Arrays.toString(a[indexMinRow]));
        System.out.println();

        int[] temp = new int[m * 2];
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i % 2 == 0) {
                temp[i] = a[indexMaxRow][maxI++];
            } else {
                temp[i] = a[indexMinRow][minI++];
            }
        }

        int tempI = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (tempI < temp.length) {
                    b[i][j] = temp[tempI++];
                }
            }
        }

        printArray(b);
    }

    static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int number : ints) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}

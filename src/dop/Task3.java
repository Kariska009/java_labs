package dop;

import java.util.Random;

public class Task3 {


    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int[][] a = new int[m][n];
        int[] sumRows = new int[m];
        int indexMaxRow = 0;
        int indexMinRow = 0;
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
                System.out.print(a[i][j] + "\t");
            }
            sumRows[i] = sum;
        }

        for (int i = 1; i < m; i++) {
            if (sumRows[i - 1] > sumRows[i]) {
                indexMaxRow = i;
            }
            if (sumRows[i - 1] > sumRows[i]) {
                indexMaxRow = i;
            }
        }
    }


}

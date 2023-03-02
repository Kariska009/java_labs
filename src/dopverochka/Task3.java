package dopverochka;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        double[][] a = new double[m][n];
        Random random = new Random();
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextDouble(50) - 25;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(String.format("%.2f", a[i][j]) + "\t");
                if (a[i][j] > 0) {
                    sum += a[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Сумма положительных элементов матрицы = " + sum);
    }

}

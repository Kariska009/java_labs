package dopverochka;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int n = 10;
        double[] a = new double[n];
        double[] c = new double[n];
        int countPositiveA = 0;
        int countNegativeC = 0;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = random.nextDouble(50) - 25;
            if (a[i] > 0) {
                countPositiveA++;
            }

            c[i] = random.nextDouble(50) - 25;
            if (c[i] < 0) {
                countNegativeC++;
            }
        }

        System.out.println("A: " + Arrays.toString(a));
        System.out.println("Количество положительных элементов массива А = " + countPositiveA);
        System.out.println("C: " + Arrays.toString(c));
        System.out.println("Количество отрицательных элементов массива С = " + countNegativeC);
    }

}

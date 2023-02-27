package dop;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    private static final int N = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[N];
        int k = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(100 - 1) + 1;
        }

        System.out.println("Все чила: " + Arrays.toString(numbers));

        System.out.print("Все нечтные числа: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                k++;
            }
        }
        System.out.println();

        System.out.println("Количество нечнтных чисел: " + k);
    }
}

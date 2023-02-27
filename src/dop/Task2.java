package dop;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    private static final int N = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(100 - 1) + 1;
        }

        System.out.println("Все чила: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Два наибольших числа: " + numbers[9] + ", " + numbers[8]);
    }

}

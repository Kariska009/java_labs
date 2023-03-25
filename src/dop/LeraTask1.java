package dop;

import java.util.Random;
import java.util.Arrays;


public class LeraTask1 {
    private static final int n = 10;
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100 - 1) + 1;
        }

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Min elements:" + numbers[0]);


    }
}

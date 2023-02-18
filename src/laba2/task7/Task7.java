package laba2.task7;

public class Task7 {
    public static void main(String[] args) {
        int[] d = new int[30];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 100);
        }

        for (int number : d) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Сумма четных: " + sumEven);
        System.out.println("Сумма нечетных: " + sumOdd);
    }
}

 package main;

public class Task1 {

    public static void main(String[] args) {
        double result = 1;

        for (int i = 2; i <= 10_000; i++) {
            if (i % 2 == 0) {
                result -= 1.0 / i;
            } else {
                result += 1.0 / i;
            }
        }

        System.out.println("Ответ равен: " + result);
    }

}

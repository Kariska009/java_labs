package laba4.n2_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int number;
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите число: ");
                number = in.nextInt();

                switch (number) {
                    case 0:
                        System.out.println("Ноль");
                        return;
                    case 1:
                        System.out.println("Один");
                        return;
                    case 2:
                        System.out.println("Два");
                        return;
                    case 3:
                        System.out.println("Три");
                        return;
                    case 4:
                        System.out.println("Четыре");
                        return;
                    case 5:
                        System.out.println("Пять");
                        return;
                    case 6:
                        System.out.println("Шесть");
                        return;
                    case 7:
                        System.out.println("Семь");
                        return;
                    case 8:
                        System.out.println("Восемь");
                        return;
                    case 9:
                        System.out.println("Девять");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Вы вели некоректное число.");
            }
        }
    }
}

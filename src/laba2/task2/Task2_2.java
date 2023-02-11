package laba2.task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            String number = in.nextLine();

            switch (number) {
                case "0":
                    System.out.println("Ноль");
                    return;
                case "1":
                    System.out.println("Один");
                    return;
                case "2":
                    System.out.println("Два");
                    return;
                case "3":
                    System.out.println("Три");
                    return;
                case "4":
                    System.out.println("Четыре");
                    return;
                case "5":
                    System.out.println("Пять");
                    return;
                case "6":
                    System.out.println("Шесть");
                    return;
                case "7":
                    System.out.println("Семь");
                    return;
                case "8":
                    System.out.println("Восемь");
                    return;
                case "9":
                    System.out.println("Девять");
                    return;
                default:
                    System.out.println("Введите число от 0 до 9");
            }
        }
    }
}

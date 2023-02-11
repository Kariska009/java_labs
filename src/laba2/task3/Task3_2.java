package laba2.task3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            String str = in.nextLine();

            switch (str) {
                case "Ноль":
                    System.out.println(0);
                    return;
                case "Один":
                    System.out.println(1);
                    return;
                case "Два":
                    System.out.println(2);
                    return;
                case "Три":
                    System.out.println(3);
                    return;
                case "Четыре":
                    System.out.println(4);
                    return;
                case "Пять":
                    System.out.println(5);
                    return;
                case "Шесть":
                    System.out.println(6);
                    return;
                case "Семь":
                    System.out.println(7);
                    return;
                case "Восемь":
                    System.out.println(8);
                    return;
                case "Девять":
                    System.out.println(9);
                    return;
                default:
                    System.out.println("Вы ввели неверное значение");
            }
        }
    }
}

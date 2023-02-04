package main.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();

        System.out.println(map.getOrDefault(number, "Введите число от 0 до 9"));
    }

}

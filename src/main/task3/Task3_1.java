package main.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ноль", 0);
        map.put("Один", 1);
        map.put("Два", 2);
        map.put("Три", 3);
        map.put("Четыре", 4);
        map.put("Пять", 5);
        map.put("Шесть", 6);
        map.put("Семь", 7);
        map.put("Восемь", 8);
        map.put("Девять", 9);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = in.nextLine();

        System.out.println(map.get(number));
    }
}

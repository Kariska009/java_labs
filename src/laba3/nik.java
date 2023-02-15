package laba3;

import java.util.Scanner;

public class nik {
    static void zad1() {
        System.out.println("Задание 1:");
        double x = 1;
        for (int i = 2; i <= 10000; i++) {
            if (i % 2 == 0) {
                x -= 1. / i;
            } else {
                x += 1. / i;
            }
        }
        System.out.printf("Ответ задания 1: %.2f \n", x);
    }

    static void zad2() {
        System.out.println("Задание 2:");
        System.out.print("Введите цифру:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 0:
                System.out.print("ноль");
                break;
            case 1:
                System.out.print("один");
                break;
            case 2:
                System.out.print("два");
                break;
            case 3:
                System.out.print("три");
                break;
            case 4:
                System.out.print("четыре");
                break;
            case 5:
                System.out.print("пять");
                break;
            case 6:
                System.out.print("шесть");
                break;
            case 7:
                System.out.print("семь");
                break;
            case 8:
                System.out.print("восемь");
                break;
            case 9:
                System.out.print("девять");
                break;
            default:
                System.out.print("вы ввели не цифру");
        }
        System.out.print("\n");
    }

    static void zad3() {
        System.out.println("Задание 3:");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цифру(прописью): ");
        String zifra = in.next();
        switch (zifra) {
            case ("ноль"):
                System.out.print("0");
                break;
            case ("один"):
                System.out.print("1");
                break;
            case ("два"):
                System.out.print("2");
                break;
            case ("три"):
                System.out.print("3");
                break;
            case ("четыре"):
                System.out.print("4");
                break;
            case ("пять"):
                System.out.print("5");
                break;
            case ("шесть"):
                System.out.print("6");
                break;
            case ("семь"):
                System.out.print("7");
                break;
            case ("восемь"):
                System.out.print("8");
                break;
            case ("девять"):
                System.out.print("девять");
                break;
            default:
                System.out.print("вы ввели не цифру");
        }
        System.out.print("\n");
    }

    static void printArr(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    static int maxA(int[] arr) {
        int i_max = 0;
        for (int i = 0; i < 25; i++) {
            if (arr[i] > arr[i_max])
                i_max = i;
        }
        return i_max;
    }

    static int minA(int[] arr) {
        int i_min = 0;
        for (int i = 0; i < 25; i++) {
            if (arr[i] < arr[i_min])
                i_min = i;
        }
        return i_min;
    }

    static void zad4() {
        System.out.println("Задание 4:");
        int[] arrayA = new int[25];
        System.out.println("Массив А:");
        for (int i = 0; i < 25; i++) {
            arrayA[i] = ((int) (Math.random() * 101) - 50);
            System.out.print("\t" + arrayA[i]);
        }
        int t = arrayA[maxA(arrayA)];
        arrayA[maxA(arrayA)] = arrayA[minA(arrayA)];
        arrayA[minA(arrayA)] = t;
        System.out.println("\nНовый массив:");
        printArr(arrayA, 25);
        System.out.print("\n");
        System.out.println("Максимальный элемент:" + arrayA[maxA(arrayA)]);
    }

    static void sortB(int[] array) {
        int temp;
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25 - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void zad5() {
        System.out.println("Задание 5:");
        int[] arrayB = new int[25];
        System.out.println("Массив B:");
        for (int i = 0; i < 25; i++) {
            arrayB[i] = ((int) (Math.random() * 101) - 50);
            System.out.print("\t" + arrayB[i]);
        }
        sortB(arrayB);
        System.out.println("\nОтсортированный массив:\n");
        printArr(arrayB, 25);
        System.out.print("\n");
    }

    static void zad6() {
        int summ = 0;
        double srznach;
        System.out.println("Задание 6:");
        int[] arrayC = new int[25];
        System.out.println("Массив C:");
        for (int i = 0; i < 20; i++) {
            arrayC[i] = ((int) (Math.random() * 81) - 40);
            System.out.print("\t" + arrayC[i]);
            summ += arrayC[i];
        }
        srznach = summ / 20;
        System.out.println("\nСреднее значение:" + srznach);
    }

    static void zad7() {
        int sumChet = 0, sumNeChet = 0;
        System.out.println("Задание 7:");
        int[] arrayC = new int[30];
        System.out.println("Массив D:");
        for (int i = 0; i < 30; i++) {
            arrayC[i] = ((int) (Math.random() * 101) - 40);
            System.out.print("\t" + arrayC[i]);
        }
        for (int i = 0; i < 30; i++) {
            if (arrayC[i] % 2 != 0) {
                sumNeChet += arrayC[i];
            } else {
                sumChet += arrayC[i];
            }
        }
        System.out.println("\nСумма четных:" + sumChet + "\nСумма нечетных:" + sumNeChet);
    }

    static void zad8() {
        int[][] a = new int[3][5];
        System.out.println("Задание 8:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
    }
}

package laba4.n2_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int[] a = new int[25]; // Ошибка когда размерность массива меньше 0

            for (int i = 0; i < a.length; i++) { // Ошибка когда размерность массива в условии цикла превышена. a.length + 1
                a[i] = (int) (Math.random() * 100);
            }

            System.out.println(Arrays.toString(a)); // Ошибка при указании отоюражения неверного симлова в строке. Arrays.toString(a).charAt(1000)
            int maxIndex = findMaxIndex(a);
            int minIndex = findMinIndex(a);
            System.out.println("Max index = " + maxIndex + ", " + "min index = " + minIndex);
            swapElementsByIndex(a, maxIndex, minIndex);
            System.out.println(Arrays.toString(a));

            System.out.println(findMaxElement(a));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("попытка адресовать элементы за пределами массива. " + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("исключение возникает при попытке создать массив отрицательного размера. " + e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("(указание позиции, лежащей за границей строки. " + e);
        }
    }
    static int findMaxIndex(int[] a) {
        int maxElementIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[maxElementIndex] < a[i]) {
                maxElementIndex = i;
            }
        }

        return maxElementIndex;
    }

    static int findMinIndex(int[] a) {
        int minElementIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[minElementIndex] > a[i]) {
                minElementIndex = i;
            }
        }

        return minElementIndex;
    }

    static int findMaxElement(int[] a) {
        int maxElement = a[0];

        for (int i = 1; i < a.length; i++) {
            if (maxElement < a[i]) {
                maxElement = a[i];
            }
        }

        return maxElement;
    }

    static void swapElementsByIndex(int[] a, int firstIndex, int secondIndex) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
}

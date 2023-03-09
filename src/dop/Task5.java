package dop;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] b = new int[3][4];
        int[][] c;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = random.nextInt(25);
                b[i][j] = random.nextInt(25);
            }
        }

        printArray(a);
        System.out.println();
        printArray(b);
        System.out.println();

        c = sumArrays(a, b);

        printArray(c);
        System.out.println();

        printArray(transposeArray(c));
    }

    static int[][] transposeArray(int[][] arr) {
        int[][] transposedArray = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposedArray[j][i] = arr[i][j];
            }
        }

        return transposedArray;
    }

    static int[][] sumArrays(int[][] arr1, int[][] arr2) {
        int[][] c = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                c[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return c;
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}

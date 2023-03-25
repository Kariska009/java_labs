package doplerochka;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        System.out.print("M = ");
        int m = scanner.nextInt();
        System.out.print("N = ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        Random rnd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(3);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[] firstRow = matrix[0];
        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            if (isEqual(firstRow, matrix[i])) {
                count++;
            }
        }

        System.out.println("Количество строк, похожих на первую: " + count);
    }

    private static boolean isEqual(int[] firstArray, int[] secondArray) {
        Set<Integer> intersectSet = new HashSet<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    intersectSet.add(firstArray[i]);
                }
            }
        }

        return intersectSet.size() == firstArray.length;
    }

}

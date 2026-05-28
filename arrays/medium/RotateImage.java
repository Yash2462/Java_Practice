package arrays.medium;

import java.util.Arrays;

/**
 * Rotate Image: Rotate an n x n 2D matrix by 90 degrees (clockwise) in-place.
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // 1. Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2. Reverse each row
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    private static void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix1);
        rotate(matrix1);
        System.out.println("Rotated Matrix (90 deg clockwise):");
        printMatrix(matrix1);

        int[][] matrix2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix2);
        rotate(matrix2);
        System.out.println("Rotated Matrix (90 deg clockwise):");
        printMatrix(matrix2);
    }
}

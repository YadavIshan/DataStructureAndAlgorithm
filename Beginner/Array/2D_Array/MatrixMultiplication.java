package Array.TwoD_Array;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for First Matrix
        System.out.println("Enter dimensions for the first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter elements for the first matrix:");
        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols1; col++) {
                matrix1[row][col] = scanner.nextInt();
            }
        }

        // Input for Second Matrix
        System.out.println("Enter dimensions for the second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter elements for the second matrix:");
        for (int row = 0; row < rows2; row++) {
            for (int col = 0; col < cols2; col++) {
                matrix2[row][col] = scanner.nextInt();
            }
        }

        // Validation: Columns of first matrix must equal Rows of second matrix
        if (cols1 != rows2) {
            System.out.println("Invalid input");
            return;
        }

        // Matrix Multiplication
        int[][] productMatrix = new int[rows1][cols2];

        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols2; col++) {
                
                // Calculate dot product for productMatrix[row][col]
                for (int commonDim = 0; commonDim < cols1; commonDim++) {
                    productMatrix[row][col] += matrix1[row][commonDim] * matrix2[commonDim][col];
                }
                
            }
        }

        // Output Result
        System.out.println("Product of the matrices:");
        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols2; col++) {
                System.out.print(productMatrix[row][col] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

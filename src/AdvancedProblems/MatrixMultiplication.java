package AdvancedProblems;

import java.util.Scanner;
public class MatrixMultiplication {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] first, second, result;
            int r1, c1, r2, c2, i, j;

            System.out.print("Enter rows and columns for first Matrix: ");
            r1 = scanner.nextInt();
            c1 = scanner.nextInt();

            System.out.print("Enter rows and columns for second Matrix: ");
            r2 = scanner.nextInt();
            c2 = scanner.nextInt();

            if (c1 != r2) {
                System.out.println("Error! The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
                return;
            }

            first = new int[r1][c1];
            second = new int[r2][c2];
            result = new int[r1][c2];

            System.out.println("\nThis is the first Matrix:");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    System.out.print("First matrix [" + i + "][" + j + "] = ");
                    first[i][j] = scanner.nextInt();
                    System.out.println();
                }
            }

            System.out.println("\nThis is the second Matrix:");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    System.out.print("Second matrix [" + i + "][" + j + "] = ");
                    second[i][j] = scanner.nextInt();
                    System.out.println();
                }
            }

            // Matrix multiplication
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += first[i][k] * second[k][j];
                    }
                }
            }

            System.out.println("\nResult Matrix:");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

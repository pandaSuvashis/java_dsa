import java.util.*;

public class Main {

    // Rotate matrix 90 degrees clockwise
    static void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int start = 0;
            int end = n - 1;

            while (start <= end) {

                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

        // Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    // Spiral Matrix
    static List<Integer> spiralMatrix(int[][] matrix) {

        int n = matrix[0].length; // columns
        int m = matrix.length;    // rows

        int startingRow = 0;
        int endingRow = m - 1;

        int startingCol = 0;
        int endingCol = n - 1;

        List<Integer> res = new ArrayList<>();

        while (startingRow <= endingRow &&
               startingCol <= endingCol) {

            // 1. Left -> Right
            for (int i = startingCol; i <= endingCol; i++) {
                res.add(matrix[startingRow][i]);
            }
            startingRow++;


            // 2. Top -> Bottom
            for (int j = startingRow; j <= endingRow; j++) {
                res.add(matrix[j][endingCol]);
            }
            endingCol--;


            // 3. Right -> Left
            if (startingRow <= endingRow) {

                for (int i = endingCol; i >= startingCol; i--) {
                    res.add(matrix[endingRow][i]);
                }

                endingRow--;
            }


            // 4. Bottom -> Top
            if (startingCol <= endingCol) {

                for (int j = endingRow; j >= startingRow; j--) {
                    res.add(matrix[j][startingCol]);
                }

                startingCol++;
            }
        }

        return res;
    }


    public static void main(String[] args) {

        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // Before rotation
        System.out.println("Before:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // Rotate matrix
        System.out.println("\nAfter Rotation:");

        rotate(matrix);


        // Spiral Matrix
        System.out.println("\nSpiral Matrix:");

        List<Integer> result = spiralMatrix(matrix);

        System.out.println(result);
    }
}
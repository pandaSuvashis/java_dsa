import java.util.*;

public class twoDarrays {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(arr);

        System.out.println("Sum of elements: " + sum(arr));
        System.out.println("Maximum element: " + max(arr));

        rowSum(arr);
        columnSum(arr);

        System.out.println("Transpose Matrix:");
        int[][] t = transpose(arr);
        printMatrix(t);

        System.out.println("Primary Diagonal Sum: " + primaryDiagonal(arr));
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonal(arr));

        System.out.println("Spiral Traversal:");
        spiral(arr);

        System.out.println("Search 5: " + search(arr, 5));
    }

    // 🔹 Print matrix
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 🔹 Sum of all elements
    static int sum(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    // 🔹 Max element
    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) max = num;
            }
        }
        return max;
    }

    // 🔹 Row-wise sum
    static void rowSum(int[][] arr) {
        System.out.println("Row-wise sum:");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + i + ": " + sum);
        }
    }

    // 🔹 Column-wise sum
    static void columnSum(int[][] arr) {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            System.out.println("Column " + j + ": " + sum);
        }
    }

    // 🔹 Transpose
    static int[][] transpose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] t = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = arr[i][j];
            }
        }
        return t;
    }

    // 🔹 Primary diagonal
    static int primaryDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    // 🔹 Secondary diagonal
    static int secondaryDiagonal(int[][] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i][n - i - 1];
        }
        return sum;
    }

    // 🔹 Spiral traversal
    static void spiral(int[][] arr) {
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
        System.out.println();
    }

    // 🔹 Search element
    static boolean search(int[][] arr, int key) {
        for (int[] row : arr) {
            for (int num : row) {
                if (num == key) return true;
            }
        }
        return false;
    }
}

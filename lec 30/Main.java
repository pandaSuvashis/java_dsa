public class Main {

    static void rotate(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {

            int start = 0, end = n - 1;
            while (start <= end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    //spiral matrix
    static void Spriral_matrix(){

       return;
    }





    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        // before
        
        System.out.println("\nbefore!!!");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nAfter!!!");
        rotate(matrix);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("spiral matrix!!!");
        System.out.println();






    }

}
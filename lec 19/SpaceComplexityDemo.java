public class SpaceComplexityDemo {

    // O(1) Space
    public static void constantSpace(int n) {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println(c);
    }

    // O(n) Space
    public static void linearSpace(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        System.out.println("Array Created of Size: " + n);
    }

    // O(n²) Space
    public static void quadraticSpace(int n) {

        int[][] matrix = new int[n][n];

        System.out.println("Matrix Size: " + n + " x " + n);
    }

    // O(log n) Space (Recursive)
    public static void logarithmicSpace(int n) {

        if (n <= 1)
            return;

        logarithmicSpace(n / 2);
    }

    public static void main(String[] args) {

        System.out.println("===== O(1) Space =====");
        constantSpace(100);

        System.out.println("\n===== O(n) Space =====");
        linearSpace(10);

        System.out.println("\n===== O(n²) Space =====");
        quadraticSpace(5);

        System.out.println("\n===== O(log n) Space =====");
        logarithmicSpace(16);

        System.out.println("Completed");
    }
}
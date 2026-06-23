public class TimeComplexityDemo {

    // O(1) - Constant Time
    public static void constantTime(int[] arr) {
        System.out.println(arr[0]);
    }

    // O(n) - Linear Time
    public static void linearTime(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // O(n²) - Quadratic Time
    public static void quadraticTime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    // O(log n) - Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    // O(n log n)
    public static void nLogN(int[] arr) {
        java.util.Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9, 3};
        

        System.out.println("===== O(1) =====");
        constantTime(arr);

        System.out.println("\n===== O(n) =====");
        linearTime(arr);

        System.out.println("\n===== O(n²) =====");
        quadraticTime(arr);

        System.out.println("\n===== O(log n) =====");
        int index = binarySearch(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                7
        );
        System.out.println("Found at index: " + index);

        System.out.println("\n===== O(n log n) =====");
        nLogN(arr);
    }
}
import java.util.*;

public class ArraysExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Declaration & Initialization
        int[] arr = {5, 2, 9, 1, 7};

        // 2. Printing array
        System.out.println("Original Array:");
        printArray(arr);

        // 3. Taking input
        System.out.println("\nEnter size of array:");
        int n = sc.nextInt();
        int[] inputArr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            inputArr[i] = sc.nextInt();
        }

        System.out.println("Your Array:");
        printArray(inputArr);

        // 4. Sum of array
        System.out.println("Sum: " + sum(inputArr));

        // 5. Find maximum
        System.out.println("Max: " + max(inputArr));

        // 6. Linear Search
        System.out.println("Enter element to search:");
        int key = sc.nextInt();
        int index = linearSearch(inputArr, key);
        System.out.println("Found at index: " + index);

        // 7. Reverse array
        reverse(inputArr);
        System.out.println("Reversed Array:");
        printArray(inputArr);

        // 8. Sorting
        Arrays.sort(inputArr);
        System.out.println("Sorted Array:");
        printArray(inputArr);

        sc.close();
    }

    // Print array
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sum of elements
    static int sum(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Maximum element
    static int max(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    // Linear search
    static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Reverse array
    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
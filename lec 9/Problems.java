public class Problems {

    static int secondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            second = largest;
            largest = num;
        } else if (num > second && num != largest) {
            second = num;
        }
    }
    return second;
}



static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return true;
}


static void countEvenOdd(int[] arr) {
    int even = 0, odd = 0;

    for (int num : arr) {
        if (num % 2 == 0) even++;
        else odd++;
    }

    System.out.println("Even: " + even + ", Odd: " + odd);
}



static void findDuplicates(int[] arr) {
    System.out.print("Duplicates: ");
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.print(arr[i] + " ");
                break;
            }
        }
    }
    System.out.println();
}


static void rotateRight(int[] arr) {
    int last = arr[arr.length - 1];

    for (int i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }

    arr[0] = last;
}

static int binarySearch(int[] arr, int key) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (arr[mid] == key) return mid;
        else if (arr[mid] < key) left = mid + 1;
        else right = mid - 1;
    }

    return -1;
}


static void moveZeros(int[] arr) {
    int index = 0;

    for (int num : arr) {
        if (num != 0) {
            arr[index++] = num;
        }
    }

    while (index < arr.length) {
        arr[index++] = 0;
    }
}

static int min(int[] arr) {
    int min = arr[0];

    for (int num : arr) {
        if (num < min) {
            min = num;
        }
    }
    return min;
}



static int sumEvenIndex(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i += 2) {
        sum += arr[i];
    }

    return sum;
}


static void uniqueElements(int[] arr) {
    System.out.print("Unique: ");

    for (int i = 0; i < arr.length; i++) {
        boolean isUnique = true;

        for (int j = 0; j < arr.length; j++) {
            if (i != j && arr[i] == arr[j]) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            System.out.print(arr[i] + " ");
        }
    }
    System.out.println();
}

static void printArray(int arr[]){
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
}


public static void main(String args[]){

    int arr[] = {1,20,0,50,70,1,202,00,10,5};

    System.out.println("Second Largest: " + secondLargest(arr));
System.out.println("Is Sorted: " + isSorted(arr));
countEvenOdd(arr);
findDuplicates(arr);
rotateRight(arr);
printArray(arr);
System.out.println("Binary Search: " + binarySearch(arr, 5));
moveZeros(arr);
printArray(arr);
System.out.println("Min: " + min(arr));
System.out.println("Sum Even Index: " + sumEvenIndex(arr));
uniqueElements(arr);


}




}

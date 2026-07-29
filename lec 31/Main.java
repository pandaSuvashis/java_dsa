public class Main {

    // print array
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // bubble sort
    static void bubble(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

    }
    
    //selection sort
    public static void selectionSort(int arr[]){
        int n= arr.length;
        for(int i =0;i<n-1;i++){
            for(int j = i+1; j<n ;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    
    //insertion sort
    static void insertion(int arr[]){
        //time complexity = O(n)
        int n = arr.length;
        for( int i =1; i<n ; i++){
            int key = arr[i];
            int j =i-1;
            while ( j >= 0 && key <arr[j]) {
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] =key;

        }
    }


    public static void main(String[] args) {
        System.out.println("LEC 31\n");
        //bubble sort
        int arr[] = { 5, 3, 1, 6, 7 };
        bubble(arr);
        System.out.println("bubble sort!!!");
        printArray(arr);
        System.out.println();

        //selection sort 
        int arr1[] = {9,8,7,6,5,4,3,2,1};
        selectionSort(arr1);
        System.out.println("selection sort");
        printArray(arr1);
        System.out.println();

        //insertion sort
        int arr2[]= {9,8,7,6,5,4,3,2,1};
        insertion(arr2);
        System.out.println("insertion sort!!!");
        printArray(arr2);


    }
}

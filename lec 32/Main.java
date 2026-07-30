public class Main{

    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static int BinarySearch(int arr[], int key){
        int start  = 0;
        int end =arr.length-1;
        
        while(start <= end){
            int mid =  start+(end -start)/2;
            if(arr[mid] == key){
                System.out.print("The answer is: ");
                return mid;
            }
            else if(arr[mid] < key) start = mid +1;
            else end = mid -1;
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Binary search!!!");
        System.out.println();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        printArray(arr);
        System.out.println();
        System.out.println(BinarySearch(arr, 7));

    }
}
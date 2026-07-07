import java.util.Arrays;

public class Main{

    //average of the array
    static double getAvg(int a[]){
        double sum=0;
        for(int i :  a){
           sum += i;
        }
        System.out.println("The average of the arrays: ");
        double avg = sum/(double) a.length;
        return avg;
    }

    //multiply each element with 10
    static void multiplyArray(int a[]){
        int b[] =  new int[a.length];
        for(int i=0; i<a.length ; i++){
            b[i] =  a[i] *10;
        }

        for(int i  : b){
            System.out.print(i+" ");
        }
    }

    //linear search
    static void Linearsearch(int arr[],int key){

        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == key){
                System.out.println("The element "+key+" is present in the index: "+i );
                return;
            }
            
                }
            System.out.println("not present element!!!");
            
    }

    //maximum element of an array
    static int MaxEle(int arr[]) {
        if (arr.length == 0) {
        throw new IllegalArgumentException("Array is empty");
            }
        int mx = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    //maxEle part 2 
    static int MaxEle2(int arr[]) {
        int mx = arr[0];

        for (int i = 0; i < arr.length; i++) {

            mx  =  Math.max(mx, arr[i]);

        }

        return mx;
    }

    //Count noof Zeros and ones 
    static void Count(int[] arr) {

        int zero = 0;
        int ones = 0;

        for (int i : arr) {

            if (i != 0 && i != 1) {
                System.out.println(i + " is neither 0 nor 1");
                continue;
            }

            if (i == 0)
                zero++;
            else
                ones++;
        }

        System.out.println("Zeros = " + zero);
        System.out.println("Ones = " + ones);
    }


    // sum of negative and positive numbers 
    static int[] SUMS(int arr[]){
        int neg= 0;
        int pos =0;

        for(int i : arr){
            if(i > 0){
                pos+=i;
            }else{
                neg+=i;
            }
        }
        int ans[] = {neg ,pos};
        return ans;
    }

    //first element of the unsorted array
    static int Un_sort(int arr[]){
        for (int i=0; i<arr.length ; i++){
            if(arr[i+1] < arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
    System.out.println("Introduction to Problem solving!! starting with array");
    //average of the array
    int a[] = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(getAvg(a));

    //multiplyArray with k =10;
    multiplyArray(a);
    System.out.println();

    // Linear search
    Linearsearch(a , 10);
    System.out.println();

    //maxi element
    System.out.println(MaxEle(a));
    //maxi ele 2 
    System.out.println(MaxEle2(a));
    //Count zeros and ones 
    int x[] = {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    Count(x);

    //sum of pos and neg elements
    int pos_neg[] = {2,-3,-1,4,6,-9};
    System.out.println(Arrays.toString(SUMS(pos_neg)));


    //return first element of the unsorted element 
    int array[] =  {1,2,3,44,5};
    System.out.println(Un_sort(array));
    }
}
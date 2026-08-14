public class Main{

    //lowerbound of the array!!!!
    static int getLowerBound(int arr[], int target){
        int n =arr.length;
        int s=0, e =n-1,ans=-1;

        while(s <=e){
            int mid = s +(e-s)/2;
            if(arr[mid] >= target){
                ans =mid;
                e =mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }

    //upper bound!!!!!!
    static int getUpperBound(int arr[], int target){
        int n =arr.length;
        int s=0, e =n-1,ans=-1;

        while(s <=e){
            int mid = s +(e-s)/2;
            if(arr[mid]  > target){
                ans =mid;
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }


    static int NumberOfOccurences(int a[] , int target){

        int lowerbound = getLowerBound(a, target);
        int upperBound = getUpperBound(a, target);

        return upperBound - lowerbound ;
    }




    public static void main(String args[]){
        System.out.println("Upper/Lower Bound, Number of Occurrences Binary Search");

        //getLowerBound
        System.out.println();
        int arr1[] ={10,30,20,30,30,30,40,50};  
        System.out.println(getLowerBound(arr1, 30));

        //getUpperBound 
        int arr2[] = {10,20,30,40,50,50,60,70,80};
        System.out.println(getUpperBound(arr2, 55));

        //number of occurences
        int arr3[] = {1,1,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4};
        System.out.println(NumberOfOccurences(arr3, 2));


    }
}   
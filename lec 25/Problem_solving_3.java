import java.util.HashSet;
import java.util.Arrays;


public class Problem_solving_3{

    // problem 0: union of two arrays common elements 
    static HashSet<Integer> Intersection(int  arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }

        for(int x : arr2){
            if(set.contains(x)){
                ans.add(x);
            }
        }

        return ans;
        
    }



    //1. sort the array of elements with 0's and 1's 
    static void Sort_ele(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] == 1 && arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                // or 
                /*  
                arr[i] = 0;
                arr[j] =1;

                 */
            }

            if(arr[start] == 0) start++;
            if(arr[end] == 1) end--;
        }

        for(int i : arr){
            System.out.print(i+" ");

        }
    }


        //2. missing number 
        static void Missing(int arr[]){


            int n = arr.length;
            int len =  n * (n+1) / 2;
            int sum = 0;
            for(int i : arr){
                sum += i;
            }

            System.out.println(len - sum);

            //for sorted array
       /*     for(int i : arr){
                if (arr[i] != arr[i-1] + 1){
                    return arr[i-1] + 1
                }
            }

        */ 

            /*  using XOR 
            
            int XorSum =0;
            for(int n :  arr){
                Xorsum ^= n
            }
            int n =  arr.length;
            for(int i=0; i<=arr.length;i++){
                XorSum ^=i;
            }

            return Xorsum;
            */ 


        }



        // 3th  find the unique element
        static void unique_ele(int arr[]){
        int remain =0;
        for(int i  : arr){
            remain ^= i;
        }
        System.out.println(remain);
        }


    public static void main(String[] args) {
        System.out.println("Problem Solving part 3 ");
        System.out.println();

        // problem 0: union of two arrays common elements 
        int arr1[]={1,2,3,4}; int arr2[] = {3,4,5,6};
        System.out.println(Intersection(arr1,arr2));

        //1. sort the array of elements with 0's and 1's
        System.out.println();
        int arr3[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0};
        Sort_ele(arr3);

        //2 missing number
        System.out.println();
        int miss[] = {1,2,3,4,5,0};
        Missing(miss);

        System.out.println();

        // 3th  find the unique element
        int unique_arr[] = {1,1,2,3,4,2,3};
        unique_ele(unique_arr);

    }

}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Part_4 {

    // 1. Two sum
    static int[] Two_sum(int arr[], int target) {
        for (int i = 0, j = i + 1; i < arr.length; i++, j++) {
            if (arr[i] + arr[j] == target) {
                return new int[] { i, j };
            }
        }
        return new int[] {};

    }


    //2. Three sum
    static List<List<Integer>> Three_sum(int arr[] , int target){
        HashSet<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        Collections.sort(list);
                        ans.add(list);
                    }
                }  
            }
        }

        return new ArrayList<>(ans);
    }



    //3rd . remove duplicates

    //sarcasm and ragebaiting coders sum. joke hain yeh code 
     static int remove_duplicates(int arr[]){
      /*  HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count= map.get(arr[i]);
                map.put(arr[i], count+1);
            }else{
                map.put(arr[i],1);
            }

        }

        List<Integer> li= new ArrayList<>();

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
        
            li.add(entry.getKey());
        }

        System.out.println(li);

    }
}
*/ 

        int i=0,j =1, n = arr.length;
        if (arr.length == 0)
            return 0;
        while (j < n){
            if(arr[i] == arr[j]) j++;
            else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        int ans= i+1;
        for(int k=0; k<ans; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        return i+1;
    } 



    //4th find the first repeated integer 
    static int First_repeat_integer(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){

            map.put(i, map.getOrDefault(i,0 )+1);
        }

        for(int i : arr){
            if(map.get(i) > 1){
                return i;
            }
        }
        return -1;

    }

    //5th find the pivot index 
    static int pivot_index(int[]arr){

        int n =arr.length;
        int left_sum[] = new int[n];
        int right_sum[] = new int[n];

        left_sum[0] = arr[0];
        for(int i=1 ; i<n; i++){
            left_sum[i] = left_sum[i-1]+ arr[i];
        }
        right_sum[n-1] = arr[n-1];
        for(int j=n-2 ; j>=0; j--){
            right_sum[j] = right_sum[j+1] + arr[j];
        }


        for(int i=0 ; i<n ; i++){
            if(left_sum[i] == right_sum[i]){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Problem solving part 4");
        System.out.println();


        // 1. two sum
        int arr[] = { 1, 2, 3, 4, 5 };
        int ans[] = Two_sum(arr, 5);
        System.out.print(Arrays.toString(ans));
        System.out.println();

        //2. three-sum
        int arr2[] ={1,2,3,4,5,6,4};
        System.out.println(Three_sum(arr2, 10));

        //3rd remove duplicates
        System.out.println();
        int arr3[]=  {1,2,3,4,4,6,5};
        System.out.println(remove_duplicates(arr3));

        //4th find the first repeated integer 
        System.out.println();
        int arr4[] = {1,2,3,4,5,6,4};
       System.out.println( First_repeat_integer(arr4));

       //5th find the pivot index
       System.out.println();
       int arr5[] = {1,7,3,6,5,6};
       System.out.println(pivot_index(arr5));
       
    }
}
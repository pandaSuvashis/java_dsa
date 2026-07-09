import java.util.HashMap;
import java.util.Map;

public class Main{
    //functions 

    // 1. Reverse an array
    static void Reversed(int arr[]){ 

        int start  = 0;
        int end =  arr.length-1;

        while (start < end){
            arr[start] =  arr[start] ^ arr[end];
            arr[end] =  arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start ++;
            end--; 
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
        
     } 
     

    //2. shift array elements by position 1 
    static void  shifting(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1; i >0 ; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp; 
        
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    //2.1
    static void rotate(int[] nums, int k) {
    int n = nums.length;

    k = k % n;

    while (k > 0) {

        int temp = nums[n - 1];

        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = temp;
        k--;
    }

    for(int i : nums){
        System.out.print(i+" ");
    }

    }

    // 3.print exterme elements in an alternate manner 
    static void exterme(int arr[]){ 
        int start =0;
        int end =arr.length-1;
        
        while(start <= end){
            if(arr[start] == arr[end]){
                System.out.print(arr[start]+" ");
                break;
            }
            System.out.print(arr[start]+" ");
            start++;
            System.out.print(arr[end]+" ");
            end--;
        }
        
     }
    // 4. identify elements with highest and lowest frequency
    static void  mode_freq(int arr[]){ 
            HashMap<Integer , Integer> map =  new HashMap<>();

            for(int i =0;  i<arr.length; i++){
                if (map.containsKey(arr[i])){
                    int count=  map.get(arr[i]);
                    map.put(arr[i] , count+1);
                }else{
                    map.put(arr[i],1);
                }

            }
            System.out.println("Freq");
            for(HashMap.Entry<Integer ,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+"   "+entry.getValue());
            }

            int maxFreq = 0; 
            for(HashMap.Entry<Integer ,Integer> entry : map.entrySet()){

                if(entry.getValue()> maxFreq) maxFreq =entry.getValue();
            }            
            int answer = 0;
            
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == maxFreq) {
                answer += entry.getValue();
            }

        }
        int lowest_freq = Integer.MAX_VALUE;
        for (int freq : map.values()){
            lowest_freq = Math.min(lowest_freq, freq); 
        }
        System.out.println("the mode of the array highest freq is :" +answer);
        System.out.println("the mode of the array lowest freq is :" +lowest_freq);

        
     }
    // 5. find the mode of the array
/*  static int[] Reversed(int arr[]){ 
        
        
     } */

    //Main function
    public static void main(String args[]){
        System.out.println("Array problems solving!!!!!");
        //Reverse an array
        int arr[] = {1,2,3};
        Reversed(arr);
        System.out.println("reverse an array");
        System.out.println();

        //shift array elements by position 1 
        int shift_arr[] = {1,2,3,4,5};
        shifting(shift_arr); 
        System.out.println();
        System.out.println("shift array elements by position 1");
        System.out.println();


        //2.1 of array rotate
        int xe[] ={1,2,3,4,5};
        System.out.println();
        System.out.println("2.1 of array rotate");
        rotate(xe,4);
        System.out.println();

        //print extreme elements in an alternate manner 
        int array[]  = {1,2,3,4,5};
        System.out.println();
        System.out.println("print extreme elements in an alternate manner");
        exterme(array);
        System.out.println();

        //identify elements with highest and lowest frequency
        //solved with 5th question
        //find the mode of the array
        System.out.println();
        System.out.println("find the mode of the array");
        int aray[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        mode_freq(aray);


        
    }
}
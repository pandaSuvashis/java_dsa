public class Kadanes_algo{

    static void MaximumSubArraySum(int arr[]){
        //code
        int sum =0;
        int Maxi = Integer.MIN_VALUE;

        for(int i =0 ; i<arr.length; i++){
            sum += arr[i];
            if(sum > Maxi) Maxi =sum;
            
            if(sum < 0) sum= 0;
        }
        System.out.println(Maxi);
    }

    public static void main(String[] args) {
        //maximum subarray sum from an array!!!
        System.out.println("Kadane's algorithm");
        System.out.println();


        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArraySum(arr);

        
    }

}
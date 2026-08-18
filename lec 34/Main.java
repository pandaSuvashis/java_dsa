public class Main{
    static int peakIndexInMountainArray(int[] arr) {
        //brute forceeee
      /*  int larg = arr[0] ,idx=0;
        for(int i=0;i<arr.length ;i++){
            if(arr[i] > larg){
                larg = arr[i];
                idx =i;
            }
        }
        return idx; */

        //optimal code 

        int start =0, end =  arr.length-1;
        while(start < end){
            int mid =  start +(end -start) /2;

            if(arr[mid] >= arr[mid+1]){
                end= mid;
            }else{
                start = mid +1;
            }
        }
            return start;



    }   

    public static void main(String args[]){
        System.out.println("Find PEAK of MOUNTAIN Array ");

        int arr[] = {1,3,4,5,3,2,1};
        System.out.println("The peak index is :  "+peakIndexInMountainArray(arr));

    }


}
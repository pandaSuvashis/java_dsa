public class Main {
    
    private boolean isValid(int arr[], int k, long maxiPages) {
        
        int studentCount = 1;
        long pages = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (pages + arr[i] <= maxiPages) {
                pages = pages + arr[i];
            } 
            else {
                studentCount++;
                
                if (studentCount > k || arr[i] > maxiPages) {
                    return false;
                } 
                else {
                    pages = arr[i];
                }
            }
        }
        
        return true;
    }
    
    public int findPages(int[] arr, int k) {
        
        if (arr.length < k) {
            return -1;
        }
        
        int n = arr.length;
        
        long s = 0;
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            s = Math.max(s, arr[i]);
        }
        
        long e = sum;
        long ans = -1;
        
        while (s <= e) {
            
            long mid = s + (e - s) / 2;
            
            if (isValid(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }
        
        return (int) ans;

    }


    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int k = 2;

        int answer = new Main().findPages(arr, k);


        System.out.println("Minimum maximum pages = " + answer);
    }

}
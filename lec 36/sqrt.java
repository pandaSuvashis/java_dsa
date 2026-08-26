public class sqrt{

    static int root(int x){
        int start = 1, end =x,ans=-1;
        if(x ==0) return 0;
        while(start <= end){
           int mid = start + (end - start) /2;
            if(mid  == x/mid){
                return mid;
            }else if(mid >  x/mid){
                end = mid-1;
            }else{
                start = mid+1;
                ans = mid;
            }
        }

        return ans;

    }


    public static void main(String[] args) {
        System.out.println(root(56));
    }
}
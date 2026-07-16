import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Index_marking {

    //sol 1
    static void Missing_element1(int arr[]){
        for(int i =0; i< arr.length ; i++){
            int value = Math.abs(arr[i]) , Position = value -1;
            if(arr[Position] > 0){
                arr[Position] = -arr[Position];
            }
        }
        List<Integer> ans =  new ArrayList<>();
        for(int i=0; i<arr.length ;i++){
            if(arr[i] >0){
                ans.add(i+1);
            }
            
        }

        System.out.println("missing element solution 1  : "+ans);



    }

    //sol 2
    static void Missing_element2(int arr[]) {
        HashSet<Integer> set = new HashSet<>(); // Making new HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]); // Adding all unique value into Set
        }
        for (int i = 1; i < arr.length + 1; i++) {
            if (set.contains(i))
                set.remove(i); // If already present remove it.
            else if (!set.contains(i))
                set.add(i); // If not present add it.
        }
        System.out.print("missing element solution 2  : "+new ArrayList<Integer>(set));
    }

    public static void main(String[] args) {
        int arr1[] = { 8, 2, 1, 10, 9, 4, 6, 4, 5, 6 ,7}; // Given Array
        int arr2[] = { 8, 2, 1, 10, 9, 4, 6, 4, 5, 6 ,7}; // Given Array
        Missing_element1(arr1);
        System.out.println();
        Missing_element2(arr2);

    }
}
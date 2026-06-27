import java.util.HashMap;
import java.util.Map;
public class Freq{
    public static void main(String[] args) {
        System.out.println("frequency count using maps!!!!!");

        int arr[] = {10, 20, 10, 30, 20, 10, 40, 10, 50, 10};
        HashMap<Integer ,Integer> freq =  new HashMap<>();

        for (int i=0 ;i<arr.length; i++){
            if(freq.containsKey(arr[i])){

                int count = freq.get(arr[i]); //current frequency
                freq.put(arr[i], count +1); //increse frequency by one!!!
            }
            else{
                freq.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer ,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+ "\t" + entry.getValue());
        }
    }
}
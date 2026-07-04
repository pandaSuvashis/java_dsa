import java.util.HashMap;

public class Freq_count_java {
    public static int OnceFreq(int arr[]){
        System.out.println("function  started!!!");

        HashMap<Integer , Integer> m = new HashMap<>();
        for (int i = 0; i<arr.length ; i++){
            if(m.containsKey(arr[i])){

            int count  =  m.get(arr[i]);
            m.put(arr[i], count+1);
           }
           else{
            m.put(arr[i],1);
           }
        }

        for (HashMap.Entry<Integer,Integer> entry : m.entrySet()){
            System.out.println(entry.getKey()+ "\t" + entry.getValue());
        }

            int Max_freq =  0;
            for (HashMap.Entry<Integer ,Integer> entry  : m.entrySet()){
                if(entry.getValue() > Max_freq){
                    Max_freq = entry.getValue();
                }
            }

            int ans =  0;
            for (HashMap.Entry<Integer ,Integer> entry  : m.entrySet()){
                if(entry.getValue() ==  Max_freq){
                    ans += entry.getValue();
                }
            }
            
            
            return ans;



    } 
    public static void main(String[] args) {
    int arr[] = {1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,5,5,5,5,5,55,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7,5,5,85,5,5,5,826};
        System.out.println("The sum  of the frequency is : "+OnceFreq(arr));
    }
}

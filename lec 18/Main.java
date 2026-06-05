import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Main{
    //void print array for Arraylist
    public static void printArray(Collection<Integer> arr){
    for (int x :  arr){
        System.out.print(x+ "  ");
    }
}
    public static void main(String[] args) {
        System.out.println("Java Collections!!!!!!!");


        //ArrayList 
        Collection<Integer> Name =  new ArrayList<>();
        //adding elements in the arrayList 
        Name.add(20);
        Name.add(40);
        Name.add(60);
        Name.add(10);
        Name.add(405);
        Name.add(602);
        Name.add(202);
        Name.add(406);
        Name.add(605);
        Name.add(208);
        Name.add(403);
        Name.add(609);


                
        //using iterator 

        System.out.println("using ITERATOR");
        Iterator<Integer> IIT =  Name.iterator();
        while(IIT.hasNext()){
            System.out.print(IIT.next()+" ");
        }



        System.out.println();
        
        //printing array before removing elements
        printArray(Name);
        //size of the arrayList
        System.out.println("Size of the arrayList: " + Name.size());

        //removing elements from the arrayList 
        Name.remove(20);
        Name.remove(406);

        //size of the arrayList after removing elements
        System.out.println("Size of the arrayList after removing elements: " + Name.size());

        //printing array after removing elements
        System.out.println("Array after removing elements:");
        printArray(Name);

        //clearing the arraylist
        Name.clear();

        System.out.println("Array after clearing all elements:");
        printArray(Name);


        ArrayList<Integer> Name2 = new ArrayList<>();
        Name2.add(100);
        Name2.add(200);
        Name2.add(300);
        Name2.add(400);
        Name2.add(500);
        System.out.print("Name2 : ");
        printArray(Name2);


        //adding all the elements of Name1 to Name2
        Name.addAll(Name2);

        //after adding the elements
        System.out.println("Array after adding all elements of Name2 to Name1:");
        printArray(Name);
        System.out.println("Size of the arrayList after adding all elements: " + Name.size());

        //removeAll
        Name.removeAll(Name2);
        System.out.println("Array after removing all elements of Name2 from Name1:");
        printArray(Name);
        System.out.println("Size of the arrayList after removing all elements: " + Name.size());






        }
}
import java.util.LinkedList;
import java.util.Iterator;

public class LL{

    public static void main(String[] args) {
        System.out.println("we will be learning LinkedList using Java collections!!!!!");
        System.out.println();

        LinkedList<Integer> l  =  new LinkedList<>();
        l.add(20);
        l.add(10);
        l.add(50);
        l.add(101);
        l.add(30);
        l.add(120);
        l.add(180);
        l.add(160);

        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }


System.out.println();
        //add in first 
        l.addFirst(5);
        System.out.println(l);

System.out.println();
        //add last
        l.addLast(50);
        System.out.println(l);
System.out.println();
        //contains
        System.out.println(l.contains(999));
System.out.println();
//size
System.out.println(l.size());

        // indexOf()
        System.out.println("Index of 280: " + l.indexOf(180));
System.out.println();
        //get 
        System.out.println(l.get(5));

System.out.println();
        //get First
        System.out.println(l.getFirst());

System.out.println();
        //get Last
        System.out.println(l.getLast());
System.out.println();

        // set()
        System.out.println("Replaced Element: " + l.set(3, 999));
        System.out.println("After set(): " + l);

System.out.println();

              // toArray()
        Object[] arr = l.toArray();

        System.out.print("Array Elements: ");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

System.out.println();  

System.out.println();  
        // clone()
        LinkedList<Integer> copy = (LinkedList<Integer>) l.clone();
        System.out.println("Cloned List: " + copy);
System.out.println();  


        // lastIndexOf()
        l.add(999);
        System.out.println("After adding another 999: " + l);
        System.out.println("Last Index of 999: " + l.lastIndexOf(999));
        

        // remove(index)
        l.remove(2);
        System.out.println("After remove(2): " + l);

        // removeFirst()
        l.removeFirst();
        System.out.println("After removeFirst(): " + l);

        // removeLast()
        l.removeLast();
        System.out.println("After removeLast(): " + l);
    }
}
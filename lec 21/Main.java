import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== HASHMAP IN JAVA =====");

        // ---------------------------------------------------------
        // Creating a HashMap
        // Syntax:
        // HashMap<KeyType, ValueType> map = new HashMap<>();
        // ---------------------------------------------------------

        HashMap<Integer, String> student = new HashMap<>();


        // ---------------------------------------------------------
        // put()
        // Inserts a key-value pair.
        // If the key already exists, its value is updated.
        // ---------------------------------------------------------

        student.put(101, "Rahul");
        student.put(102, "Aman");
        student.put(103, "Priya");
        student.put(104, "Sita");
        student.put(105, "Rohit");

        System.out.println("HashMap : " + student);


        // ---------------------------------------------------------
        // putIfAbsent()
        // Inserts the value only if the key does not already exist.
        // ---------------------------------------------------------

        student.putIfAbsent(101, "New Student");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(student);


        // ---------------------------------------------------------
        // get()
        // Returns the value associated with the given key.
        // ---------------------------------------------------------

        System.out.println("\nStudent Roll 103 : " + student.get(103));


        // ---------------------------------------------------------
        // getOrDefault()
        // Returns the value if key exists.
        // Otherwise returns the default value.
        // ---------------------------------------------------------

        System.out.println(student.getOrDefault(103, "Not Found"));
        System.out.println(student);


        // ---------------------------------------------------------
        // containsKey()
        // Checks whether a key exists.
        // ---------------------------------------------------------

        System.out.println("\nContains Key 104 : " +
                student.containsKey(104));


        // ---------------------------------------------------------
        // containsValue()
        // Checks whether a value exists.
        // ---------------------------------------------------------

        System.out.println("Contains Value Rahul : " +
                student.containsValue("Rahul"));


        // ---------------------------------------------------------
        // size()
        // Returns total number of key-value pairs.
        // ---------------------------------------------------------

        System.out.println("\nSize : " + student.size());


        // ---------------------------------------------------------
        // replace()
        // Replaces the value of an existing key.
        // ---------------------------------------------------------

        student.replace(102, "Arjun");

        System.out.println("\nAfter replace():");
        System.out.println(student);


        // ---------------------------------------------------------
        // remove(key)
        // Removes the specified key and its value.
        // ---------------------------------------------------------

        student.remove(105);

        System.out.println("\nAfter remove():");
        System.out.println(student);


        // ---------------------------------------------------------
        // keySet()
        // Returns all keys as a Set.
        // ---------------------------------------------------------

        System.out.println("\nAll Keys:");

        Set<Integer> keys = student.keySet();

        for(Integer key : keys){
            System.out.println(key);
        }


        // ---------------------------------------------------------
        // values()
        // Returns all values.
        // ---------------------------------------------------------

        System.out.println("\nAll Values:");

        Collection<String> values = student.values();

        for(String value : values){
            System.out.println(value);
        }


        // ---------------------------------------------------------
        // entrySet()
        // Returns all key-value pairs.
        // Used for iterating over the entire HashMap.
        // ---------------------------------------------------------

        System.out.println("\nUsing entrySet():");

        for(Map.Entry<Integer, String> entry : student.entrySet()){

            System.out.println(
                    "Key : " + entry.getKey() +
                    "  Value : " + entry.getValue());
        }


        // ---------------------------------------------------------
        // isEmpty()
        // Checks whether the HashMap is empty.
        // ---------------------------------------------------------

        System.out.println("\nIs Empty : " +
                student.isEmpty());


        // ---------------------------------------------------------
        // clone()
        // Creates a shallow copy of the HashMap.
        // ---------------------------------------------------------

        HashMap<Integer,String> copy =
                (HashMap<Integer,String>) student.clone();

        System.out.println("\nCloned HashMap:");
        System.out.println(copy);


        // ---------------------------------------------------------
        // clear()
        // Removes every key-value pair.
        // ---------------------------------------------------------

        copy.clear();

        System.out.println("\nAfter clear():");
        System.out.println(copy);

        System.out.println("Is Empty : " + copy.isEmpty());

    }
}
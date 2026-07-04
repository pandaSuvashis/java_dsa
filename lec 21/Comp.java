import java.util.*;

// ===============================
// Student Class
// Implements Comparable
// ===============================
class Student implements Comparable<Student> {

    private int age;
    private String name;
    private int weight;

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // ==========================================
    // Comparable
    // Default Sorting -> Age (Ascending)
    // ==========================================
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.age, s.age);
    }

    // Used while printing objects
    @Override
    public String toString() {
        return "Age = " + age +
               ", Name = " + name +
               ", Weight = " + weight;
    }
}


// ==========================================
// Comparator 1
// Sort by Name
// ==========================================
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}


// ==========================================
// Comparator 2
// Sort by Weight
// ==========================================
class WeightComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getWeight(), s2.getWeight());
    }
}


// ==========================================
// Comparator 3
// Sort by Age Descending
// ==========================================
class AgeDescendingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getAge(), s1.getAge());
    }
}


// ==========================================
// Main Class
// ==========================================
public class Comp {

    // Helper function to print list
    public static void printStudents(List<Student> students) {

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "Panda", 72));
        students.add(new Student(21, "Rahul", 80));
        students.add(new Student(18, "Ankit", 65));
        students.add(new Student(20, "Rohit", 75));
        students.add(new Student(22, "Priya", 58));
        students.add(new Student(17, "Sneha", 62));
        students.add(new Student(23, "Aman", 85));
        students.add(new Student(24, "Kiran", 70));
        students.add(new Student(19, "Neha", 68));
        students.add(new Student(21, "Vikram", 90));



        // ==========================================
        // Original List
        // ==========================================
        System.out.println("Original List");
        printStudents(students);



        // ==========================================
        // Comparable
        // Sort by Age (Default Sorting)
        // ==========================================
        Collections.sort(students);

        System.out.println("Comparable -> Sort By Age");
        printStudents(students);



        // ==========================================
        // Comparator
        // Sort by Name
        // ==========================================
        Collections.sort(students, new NameComparator());

        System.out.println("Comparator -> Sort By Name");
        printStudents(students);



        // ==========================================
        // Comparator
        // Sort by Weight
        // ==========================================
        Collections.sort(students, new WeightComparator());

        System.out.println("Comparator -> Sort By Weight");
        printStudents(students);



        // ==========================================
        // Comparator
        // Sort by Age Descending
        // ==========================================
        Collections.sort(students, new AgeDescendingComparator());

        System.out.println("Comparator -> Sort By Age Descending");
        printStudents(students);



        // ==========================================
        // Comparator using Lambda
        // Sort by Name Descending
        // ==========================================
        students.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));

        System.out.println("Lambda -> Sort By Name Descending");
        printStudents(students);



        // ==========================================
        // Comparator.comparing()
        // Modern Java
        // ==========================================
        students.sort(Comparator.comparing(Student::getWeight));

        System.out.println("Comparator.comparing() -> Weight");
        printStudents(students);



        // ==========================================
        // Multiple Sorting
        // Age then Name
        // ==========================================
        students.sort(
                Comparator
                        .comparing(Student::getAge)
                        .thenComparing(Student::getName)
        );

        System.out.println("Multiple Sorting -> Age then Name");
        printStudents(students);
    }
}
public class ClassesAndObjects{
    public static void main(String args[]){


        //parametarized constructor 
        Student panda = new Student("suvashis",21,45,"D6");
        

        // //non parametarized 
        // panda.name= "Suvashis panda";
        // panda.age =20;
        // panda.id ="D6";
        // panda.nos= 45;


        System.out.println(panda.name);
        System.out.println(panda.age);
        System.out.println(panda.id);
        System.out.println(panda.nos);

        

        panda.study();
        panda.sleep();
        panda.bunk();

        //copy constructor with object b  
        Student b = new Student(panda);
        System.out.println(b.name);
    }
}
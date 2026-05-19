public class Student {
    public String name;
    public int age;
    public String id;
    public int nos;

    //defining constructor
    public Student(){
        System.out.println("at very beginning constructor called!!!");
    }

        //parametarized constructor
    public Student(String name, int age, int nos, String id){
        this.name =name;
        this.age = age;
        this.nos =nos;
        this.id = id; 

    }

    //copy constructor
    public Student(Student srcobj ){
        this.name =srcobj.name;
        this.age = srcobj.age;
        this.nos =srcobj.nos;
        this.id = srcobj.id; 
    }


    //methods/Behaviours

    public void study(){
        System.out.println("studying");
    }

    public void sleep(){
        System.out.println("sleeping");

    }
      
    public void bunk(){
        System.out.println("Bunking");
    }


} 

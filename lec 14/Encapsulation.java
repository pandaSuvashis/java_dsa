
public class Encapsulation{


    public static void main(String[] args) {
        System.out.println("OOPS concept new Pillar  1. Encapsulation");

        Student panda = new Student("Panda", 19,45 , "Single");
        System.out.println(panda.name);

        System.out.println(panda.Getgf());
        panda.Setgf("committed");
        System.out.println(panda.Getgf());
        panda.GetChat();
        
    }
}
public class Student {

    public String name;
    public int age;
    public int nos;
    private String gf;


    public Student(String name, int age, int nos, String gf){
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }

    //setter
    public void Setgf(String gf){
        this.gf = gf;
    }

    //getter
    public String Getgf(){
        return gf;
    }

    private void GfChatting(){
        System.out.println("she's chatting!!!!!");

    }


    public void GetChat(){
        GfChatting();
    }
    
}

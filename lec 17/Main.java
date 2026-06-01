
//interface of the bird 
//module of the bird
abstract class Bird{
    abstract void fly();

    abstract void eat();
}


//design of the parrot class
//implementation of the bird interface
class parrot extends Bird{
    @Override
    void fly(){
        System.out.println("parrot flies");
    }

    @Override
    void eat(){
        System.out.println("parrot eats");
    }
} 




public class Main{

    //using polymorphism  dynamic method dispatch
    public static void DoStuff(Bird B){
        B.eat();
        B.fly();
    }


  public static void main(String args[]){
        System.out.println("Let's understand Abstraction!!!!!");    
        DoStuff(new parrot());
    }
}
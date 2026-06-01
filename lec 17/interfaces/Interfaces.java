interface pakshi {

    void fly();

    void eat();
}

class Sparrow implements pakshi {

    @Override
    public void fly() {
        System.out.println("sparrow is flying!!!");
    }

    @Override
    public void eat() {
        System.out.println("sparrow is eating");
    }
}

public class Interfaces {

    public static void main(String[] args) {

        System.out.println("Implementation of interfaces in abstraction");

        pakshi p = new Sparrow();

        p.eat();
        p.fly();
    }
}
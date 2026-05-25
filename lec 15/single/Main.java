class Vehicle {

    String brand = "Toyota";

    // Parent Constructor
    Vehicle() {

        System.out.println("Vehicle Constructor Called");
    }

    // Parent Method
    void start() {

        System.out.println("Vehicle Starts");
    }
}

// Child Class
class Car extends Vehicle {

    String brand = "BMW";

    // Child Constructor
    Car() {

        // Calls Parent Constructor
        super();

        System.out.println("Car Constructor Called");
    }

    void display() {

        // Access Parent Variable
        System.out.println("Parent Brand : " + super.brand);

        // Access Parent Method
        super.start();

        // Access Child Variable
        System.out.println("Child Brand : " + brand);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.display();
    }
}
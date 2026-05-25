class Vehicle {

    void start() {

        System.out.println("Vehicle Starts");
    }
}

// Child Class 1
class Car extends Vehicle {

    void drive() {

        System.out.println("Car is Driving");
    }
}

// Child Class 2
class Bike extends Vehicle {

    void ride() {

        System.out.println("Bike is Riding");
    }
}

public class Main {

    public static void main(String[] args) {

        // Car Object
        Car c = new Car();

        c.start();
        c.drive();

        System.out.println();

        // Bike Object
        Bike b = new Bike();

        b.start();
        b.ride();
    }
}

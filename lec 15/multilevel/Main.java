class Vehicle {

    void start() {

        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {

    void drive() {

        System.out.println("Car is Driving");
    }
}

class SportsCar extends Car {

    void speed() {

        System.out.println("Sports Car is Very Fast");
    }
}

public class Main {

    public static void main(String[] args) {

        SportsCar s = new SportsCar();

        // From Vehicle
        s.start();

        // From Car
        s.drive();

        // Own Method
        s.speed();
    }
}
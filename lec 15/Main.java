class Vehicle {

    public String name;
    public int model;
    public int tyres;

    // Default Constructor
    Vehicle() {

        this.name = "";
        this.model = 0;
        this.tyres = 0;
    }

    // Parameterized Constructor
    Vehicle(String name, int model, int tyres) {

        this.name = name;
        this.model = model;
        this.tyres = tyres;
    }

    // Methods
    void starting() {

        System.out.println(
            "Starting Engine : " + name + " " + model
        );
    }

    void stop() {

        System.out.println(
            "Stopping Engine : " + name + " " + model
        );
    }
}

// Child Class 1
class Car extends Vehicle {

    public int noOfDoors;
    public String transmissionType;

    // Constructor
    Car(String name,
        int model,
        int tyres,
        String transmissionType,
        int noOfDoors) {

        // Calling Parent Constructor
        super(name, model, tyres);

        // Initializing Child Variables
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    // Child Method
    public void startAC() {

        System.out.println("Starting Car AC");
    }
}

// Child Class 2
class MotorCycle extends Vehicle {

    public String handleBar;
    public String suspensionType;

    // Constructor
    MotorCycle(String name,
                int model,
                int tyres,
                String handleBar,
                String suspensionType) {

        // Calling Parent Constructor
        super(name, model, tyres);

        // Initializing Child Variables
        this.handleBar = handleBar;
        this.suspensionType = suspensionType;
    }

    // Child Method
    void wheelie() {

        System.out.println("It's Funky!!!!!");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Creating Car Object
        Car c = new Car(
                "Toyota",
                2017,
                4,
                "Automatic",
                5
        );

        // Printing Car Details
        System.out.println(
                c.name + " "
                + c.model + " "
                + c.tyres + " "
                + c.transmissionType + " "
                + c.noOfDoors
        );

        // Calling Car Methods
        c.starting();
        c.startAC();
        c.stop();

        System.out.println();

        // Creating Motorcycle Object
        MotorCycle m = new MotorCycle(
                "Yamaha",
                2022,
                2,
                "Sports Handle",
                "Hydraulic"
        );

        // Printing Motorcycle Details
        System.out.println(
                m.name + " "
                + m.model + " "
                + m.tyres + " "
                + m.handleBar + " "
                + m.suspensionType
        );

        // Calling Motorcycle Methods
        m.starting();
        m.wheelie();
        m.stop();
    }
}
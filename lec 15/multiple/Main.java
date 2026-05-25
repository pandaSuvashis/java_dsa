interface Engine {

    void start();
}

interface MusicSystem {

    void playMusic();
}

class Car implements Engine, MusicSystem {

    public void start() {

        System.out.println("Engine Starts");
    }

    public void playMusic() {

        System.out.println("Music Playing");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.playMusic();
    }
}
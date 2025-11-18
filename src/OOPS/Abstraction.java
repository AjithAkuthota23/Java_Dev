package OOPS;

public class Abstraction {
    /*
    Abstraction: Show essential features and hide complex details
     */
    public static void main(String[] args) {
    Car c= new Tesla();
    c.start();
    c.stop();
    }
}

abstract class Car {
    abstract void start();

    void stop() {
        System.out.println("Car stopped");
    }
}

class Tesla extends Car {
    @Override
    void start() {
        System.out.println("Tesla starting...");
    }
}



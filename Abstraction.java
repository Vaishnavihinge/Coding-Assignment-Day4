
abstract class Vehicle {

    
    abstract void start();     // Abstract methods
    abstract void stop();
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }

    void stop() {
        System.out.println("Car stops using brakes");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with key");
    }

    void stop() {
        System.out.println("Bike stops using brakes");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // Abstract class reference
        

        Car c = new Car();
        c.start();
        c.stop();

        System.out.println("---------------");

        Bike B = new Bike();
        B.start();
        B.stop();
    }
}

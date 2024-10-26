// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Regular method with body
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

// Subclass Car that inherits Vehicle
class Car extends Vehicle {
    // Providing implementation for the abstract method start()
    @Override
    void start() {
        System.out.println("Car is starting with key ignition.");
    }
}

// Subclass Bike that inherits Vehicle
class Bike extends Vehicle {
    // Providing implementation for the abstract method start()
    @Override
    void start() {
        System.out.println("Bike is starting with kick start.");
    }
}

// Main class to demonstrate abstraction
public class Main {
    public static void main(String[] args) {
        // Creating objects of Car and Bike
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Calling start and stop methods
        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}

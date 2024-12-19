package Abstraction_total_Avec_interface;

// Implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    public void start(int r) {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

}

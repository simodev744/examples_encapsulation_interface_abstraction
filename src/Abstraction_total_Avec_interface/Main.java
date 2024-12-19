package Abstraction_total_Avec_interface;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();

        bike.stop();
    }
}
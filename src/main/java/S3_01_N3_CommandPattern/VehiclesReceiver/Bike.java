package S3_01_N3_CommandPattern.VehiclesReceiver;

public class Bike extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Bike acelera");;
    }

    @Override
    public void brake() {
        System.out.println("Bike frena");;
    }

    @Override
    public void turnOn() {
        System.out.println("Bike se enciende");;
    }
}

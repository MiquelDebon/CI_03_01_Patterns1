package S3_01_N3_CommandPattern.VehiclesReceiver;

public class Ship extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Ship acelera");;
    }

    @Override
    public void brake() {
        System.out.println("Ship frena");;
    }

    @Override
    public void turnOn() {
        System.out.println("Ship se enciende");;
    }
}

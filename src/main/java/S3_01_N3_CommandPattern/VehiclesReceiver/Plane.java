package S3_01_N3_CommandPattern.VehiclesReceiver;

public class Plane extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Plane acelera");;
    }

    @Override
    public void brake() {
        System.out.println("Plane frena");;
    }

    @Override
    public void turnOn() {
        System.out.println("Plane se enciende");;
    }
}

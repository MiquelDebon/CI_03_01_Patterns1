package S3_01_N3_CommandPattern.VehiclesReceiver;

public class Car extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Coche acelera");;
    }

    @Override
    public void brake() {
        System.out.println("Coche frena");;
    }

    @Override
    public void turnOn() {
        System.out.println("Coche se enciende");;
    }
}

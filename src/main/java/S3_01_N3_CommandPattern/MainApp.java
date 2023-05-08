package S3_01_N3_CommandPattern;

import S3_01_N3_CommandPattern.Commands.AccelerateCommand;
import S3_01_N3_CommandPattern.Commands.BrakeCommand;
import S3_01_N3_CommandPattern.VehiclesReceiver.*;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();

        //Commands
        AccelerateCommand accelerateCommandCar = new AccelerateCommand(car);
        BrakeCommand brakeCommandCar = new BrakeCommand(car);
        AccelerateCommand accelerateCommandBike = new AccelerateCommand(bike);
        BrakeCommand brakeCommandBike = new BrakeCommand(bike);
        AccelerateCommand accelerateCommandShip = new AccelerateCommand(ship);
        BrakeCommand brakeCommandShip = new BrakeCommand(ship);
        AccelerateCommand accelerateCommandPlane = new AccelerateCommand(plane);
        BrakeCommand brakeCommandPlane = new BrakeCommand(plane);

        //Invoker
        InvokerDriver driver = new InvokerDriver();
        driver.takeOrder(accelerateCommandCar);
        driver.takeOrder(brakeCommandCar);
        driver.takeOrder(accelerateCommandBike);
        driver.takeOrder(brakeCommandBike);
        driver.takeOrder(accelerateCommandShip);
        driver.takeOrder(brakeCommandShip);
        driver.takeOrder(accelerateCommandPlane);
        driver.takeOrder(brakeCommandPlane);

        driver.runOrders();



    }
}

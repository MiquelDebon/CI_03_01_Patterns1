package S3_01_N3_CommandPattern;

import S3_01_N3_CommandPattern.Commands.AccelerateCommand;
import S3_01_N3_CommandPattern.Commands.BrakeCommand;
import S3_01_N3_CommandPattern.Commands.TurnOnCommand;
import S3_01_N3_CommandPattern.VehiclesReceiver.*;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();

        //Commands
        TurnOnCommand turnOnCommandCar = new TurnOnCommand(car);
        AccelerateCommand accelerateCommandCar = new AccelerateCommand(car);
        BrakeCommand brakeCommandCar = new BrakeCommand(car);
        TurnOnCommand turnOnCommandBike = new TurnOnCommand(bike);
        AccelerateCommand accelerateCommandBike = new AccelerateCommand(bike);
        BrakeCommand brakeCommandBike = new BrakeCommand(bike);
        TurnOnCommand turnOnCommandShip = new TurnOnCommand(ship);
        AccelerateCommand accelerateCommandShip = new AccelerateCommand(ship);
        BrakeCommand brakeCommandShip = new BrakeCommand(ship);
        TurnOnCommand turnOnCommandPlane = new TurnOnCommand(plane);
        AccelerateCommand accelerateCommandPlane = new AccelerateCommand(plane);
        BrakeCommand brakeCommandPlane = new BrakeCommand(plane);

        //Invoker
        InvokerDriver parkingDriver = new InvokerDriver();
        parkingDriver.takeOrder(turnOnCommandCar);
        parkingDriver.takeOrder(accelerateCommandCar);
        parkingDriver.takeOrder(brakeCommandCar);
        parkingDriver.runOrders();

        parkingDriver.takeOrder(turnOnCommandBike);
        parkingDriver.takeOrder(accelerateCommandBike);
        parkingDriver.takeOrder(brakeCommandBike);
        parkingDriver.runOrders();

        parkingDriver.takeOrder(turnOnCommandShip);
        parkingDriver.takeOrder(accelerateCommandShip);
        parkingDriver.takeOrder(brakeCommandShip);
        parkingDriver.runOrders();

        parkingDriver.takeOrder(turnOnCommandPlane);
        parkingDriver.takeOrder(accelerateCommandPlane);
        parkingDriver.takeOrder(brakeCommandPlane);
        parkingDriver.runOrders();
        

    }
}

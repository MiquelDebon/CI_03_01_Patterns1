package S3_01_N3_CommandPattern.Commands;

import S3_01_N3_CommandPattern.VehiclesReceiver.Vehicle;

public class BrakeCommand implements ICommnad {

    private Vehicle vehicle;
    public BrakeCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.brake();
    }
}

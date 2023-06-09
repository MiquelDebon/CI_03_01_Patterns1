package S3_01_N3_CommandPattern.Commands;

import S3_01_N3_CommandPattern.VehiclesReceiver.Vehicle;

public class AccelerateCommand implements ICommnad {
    private Vehicle vehicle;
    public AccelerateCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.accelerate();
    }
}

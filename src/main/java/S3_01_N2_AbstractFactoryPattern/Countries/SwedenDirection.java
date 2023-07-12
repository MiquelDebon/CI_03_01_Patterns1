package S3_01_N2_AbstractFactoryPattern.Countries;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.IDirection;

public class SwedenDirection implements IDirection {

    private String country;
    private String direction;

    public SwedenDirection(){
        this.country = "Spain";
    }

    @Override
    public String getDirection(String direction) {
        return  "Direction: Sweden, " + direction;
    }
}



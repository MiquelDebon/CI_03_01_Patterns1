package S3_01_N2_AbstractFactoryPattern.Countries;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.IDirection;

public class SpainDirection implements IDirection {

    @Override
    public String getDirection(String direction) {
        return  "Direction: Spain, " + direction;
    }

}

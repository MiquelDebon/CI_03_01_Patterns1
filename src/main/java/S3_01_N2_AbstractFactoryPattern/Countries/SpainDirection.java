package S3_01_N2_AbstractFactoryPattern.Countries;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Direction;

public class SpainDirection implements Int_Direction {

    @Override
    public String getDirection(String direction) {
        return  "Direction: Spain, " + direction;
    }

}

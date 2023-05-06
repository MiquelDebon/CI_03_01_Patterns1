package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Countries.SpainDirection;
import S3_01_N2_AbstractFactoryPattern.Countries.SwedenDirection;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.AbstractFactory;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Direction;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Number;

public class DirectionAgendaFactory extends AbstractFactory {

    @Override
    public Int_Direction agendaDirection(String country) {
        if (country.equalsIgnoreCase("Spain")) {
            return new SpainDirection();
        } else if (country.equalsIgnoreCase("Sweden")) {
            return new SwedenDirection();
        }
        return null;
    }


    @Override
    public Int_Number getNumber(String country) {
        return null;
    }
}



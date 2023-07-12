package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Countries.SpainDirection;
import S3_01_N2_AbstractFactoryPattern.Countries.SwedenDirection;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.IAbstractFactory;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.IDirection;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.INumber;

public class DirectionAgendaFactory implements IAbstractFactory {

    @Override
    public IDirection agendaDirection(String country) {
        if (country.equalsIgnoreCase("Spain")) {
            return new SpainDirection();
        } else if (country.equalsIgnoreCase("Sweden")) {
            return new SwedenDirection();
        }
        return null;
    }


    @Override
    public INumber getNumber(String country) {
        return null;
    }
}



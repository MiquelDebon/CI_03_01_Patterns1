package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Countries.SpainNumber;
import S3_01_N2_AbstractFactoryPattern.Countries.SwedenNumber;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.IAbstractFactory;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.IDirection;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.INumber;

public class NumberAgendaFactory implements IAbstractFactory {

    @Override
    public INumber getNumber(String country) {
        if(country.equalsIgnoreCase("Spain")){
            return new SpainNumber();
        }else if(country.equalsIgnoreCase("Sweden")){
            return new SwedenNumber();
        }
        return null;
    }

    @Override
    public IDirection agendaDirection(String country) {
        return null;
    }
}


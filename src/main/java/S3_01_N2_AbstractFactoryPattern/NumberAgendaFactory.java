package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Countries.SpainNumber;
import S3_01_N2_AbstractFactoryPattern.Countries.SwedenNumber;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_AbstractFactory;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Direction;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Number;

public class NumberAgendaFactory implements Int_AbstractFactory {

    @Override
    public Int_Number getNumber(String country) {
        if(country.equalsIgnoreCase("Spain")){
            return new SpainNumber();
        }else if(country.equalsIgnoreCase("Sweden")){
            return new SwedenNumber();
        }
        return null;
    }

    @Override
    public Int_Direction agendaDirection(String country) {
        return null;
    }
}


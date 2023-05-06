package S3_01_N2_FactoryPattern;

public class SwedenCountry implements Agenda{
    @Override
    public String direction(String direction) {
        return  "Direction: Sweden, " + direction;
    }

    @Override
    public String number(String number) {
        return  "+46 "+number;
    }
}



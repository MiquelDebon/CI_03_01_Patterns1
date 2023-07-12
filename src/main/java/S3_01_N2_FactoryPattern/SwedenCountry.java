package S3_01_N2_FactoryPattern;

public class SwedenCountry implements IAgenda {
    @Override
    public String direction(String direction) {
        return  "Direction: Sweden, " + direction;
    }

    @Override
    public String number(String number) {
        return  "+46 "+number;
    }
}



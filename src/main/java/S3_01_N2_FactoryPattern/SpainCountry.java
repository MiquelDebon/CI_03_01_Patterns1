package S3_01_N2_FactoryPattern;

public class SpainCountry implements IAgenda {

    @Override
    public String direction(String direction) {
        return  "Direction: Spain, " + direction;
    }

    @Override
    public String number(String number) {
        return  "+34 "+number;
    }
}

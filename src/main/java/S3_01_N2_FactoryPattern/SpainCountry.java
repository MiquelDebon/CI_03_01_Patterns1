package S3_01_N2_FactoryPattern;

public class SpainCountry implements Agenda {

    @Override
    public String direction(String direction) {
        return  "Direction: Spain, " + direction;
    }

    @Override
    public String number(String number) {
        return  "+34 "+number;
    }
}

package S3_01_N2;

public class SpainCountry implements Agenda {
    private int pre = 34;

    @Override
    public String direction(String direction) {
        return  "Direction: Spain, " + direction;
    }

    @Override
    public String number(String number) {
        return  "+34 "+number;
    }
}

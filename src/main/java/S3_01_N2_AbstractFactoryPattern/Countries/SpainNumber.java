package S3_01_N2_AbstractFactoryPattern.Countries;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Number;

public class SpainNumber implements Int_Number {
    private String country;
    private String prefix;


    public SpainNumber(){
        this.country = "Spain";
        this.prefix = "+34";
    }

    @Override
    public String getNumber(String number) {
        return  this.country + ": " + this.prefix + " " + number;
    }
}

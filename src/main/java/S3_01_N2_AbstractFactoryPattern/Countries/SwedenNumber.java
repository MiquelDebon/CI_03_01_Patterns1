package S3_01_N2_AbstractFactoryPattern.Countries;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Number;

public class SwedenNumber implements Int_Number {

    private String country;
    private String prefix;


    public SwedenNumber(){
        this.country = "Sweden";
        this.prefix = "+46";
    }

    @Override
    public String getNumber(String number) {
        return  this.country + ": " + this.prefix + " " + number;
    }
}



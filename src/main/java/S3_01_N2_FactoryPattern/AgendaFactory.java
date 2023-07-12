package S3_01_N2_FactoryPattern;

public class AgendaFactory {
    public IAgenda getAgenda (String country){
        if(country.equalsIgnoreCase("Spain")){
            return new SpainCountry();
        }else if(country.equalsIgnoreCase("Sweden")){
            return new SwedenCountry();
        }
        return null;
    }
}


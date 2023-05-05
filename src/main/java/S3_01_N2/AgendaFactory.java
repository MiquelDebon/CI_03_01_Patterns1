package S3_01_N2;

public class AgendaFactory {
    public Agenda getAgenda (String country){
        if(country.equalsIgnoreCase("Spain")){
            return new SpainCountry();
        }
        return null;
    }
}


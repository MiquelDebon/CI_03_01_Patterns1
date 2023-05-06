package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String information){
        if(information.equalsIgnoreCase("number")){
            return new NumberAgendaFactory();
        }else if(information.equalsIgnoreCase("direction")){
            return new DirectionAgendaFactory();
        }else{
            return null;
        }
    }
}

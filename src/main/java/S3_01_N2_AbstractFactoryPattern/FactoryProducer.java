package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.IAbstractFactory;

public class FactoryProducer {
    public static IAbstractFactory getFactory(String information){
        if(information.equalsIgnoreCase("number")){
            return new NumberAgendaFactory();
        }else if(information.equalsIgnoreCase("direction")){
            return new DirectionAgendaFactory();
        }else{
            return null;
        }
    }
}

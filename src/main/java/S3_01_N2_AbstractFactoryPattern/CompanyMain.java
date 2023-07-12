package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.IAbstractFactory;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.IDirection;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.INumber;

import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) {

        //Storage
        ArrayList<String> companyPhoneAgenda = new ArrayList<>();
        ArrayList<String> companyDirectionAgenda = new ArrayList<>();

        //Create Factories
        IAbstractFactory numberFactory = FactoryProducer.getFactory("number");
        IAbstractFactory directionFactory = FactoryProducer.getFactory("direction");

        //Create Country Numbers
        INumber spainNumber = numberFactory.getNumber("Spain");
        INumber swedenNumber = numberFactory.getNumber("Sweden");

        //Create Country Directions
        IDirection spainDirection = directionFactory.agendaDirection("Spain");
        IDirection swedenDirection = directionFactory.agendaDirection("Sweden");


        //Insert Data
        //Phone Numbers
        companyPhoneAgenda.add(spainNumber.getNumber("610267001"));
        companyPhoneAgenda.add(spainNumber.getNumber("610267007"));
        companyPhoneAgenda.add(swedenNumber.getNumber("610267002"));
        //Directions
        companyDirectionAgenda.add(spainDirection.getDirection("Barcelona, consell de cent"));
        companyDirectionAgenda.add(spainDirection.getDirection("Madrid, Granvia 234"));
        companyDirectionAgenda.add(swedenDirection.getDirection("Umea, Gother"));

        //Print Company Data
        System.out.println("Directions:");
        companyDirectionAgenda.forEach(System.out::println);
        System.out.println("\nPhone Numbers:");
        companyPhoneAgenda.forEach(System.out::println);
    }
}

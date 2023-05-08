package S3_01_N2_AbstractFactoryPattern;

import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_AbstractFactory;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Direction;
import S3_01_N2_AbstractFactoryPattern.Intermediarios.Int_Number;

import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) {

        //Storage
        ArrayList<String> companyPhoneAgenda = new ArrayList<>();
        ArrayList<String> companyDirectionAgenda = new ArrayList<>();

        //Create Factories
        Int_AbstractFactory numberFactory = FactoryProducer.getFactory("number");
        Int_AbstractFactory directionFactory = FactoryProducer.getFactory("direction");

        //Create Country Numbers
        Int_Number spainNumber = numberFactory.getNumber("Spain");
        Int_Number swedenNumber = numberFactory.getNumber("Sweden");

        //Create Country Directions
        Int_Direction spainDirection = directionFactory.agendaDirection("Spain");
        Int_Direction swedenDirection = directionFactory.agendaDirection("Sweden");


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

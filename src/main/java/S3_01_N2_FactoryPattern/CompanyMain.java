package S3_01_N2_FactoryPattern;

import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) {

        ArrayList<String> companyPhoneAgenda = new ArrayList<>();
        ArrayList<String> companyDirectionAgenda = new ArrayList<>();

        AgendaFactory agendaFactory = new AgendaFactory();

        IAgenda spain = agendaFactory.getAgenda("Spain");
        companyPhoneAgenda.add(spain.number("610267001"));
        companyDirectionAgenda.add(spain.direction("C/Gracia 127, Barcelona"));

        IAgenda sweden = agendaFactory.getAgenda("Sweden");
        companyPhoneAgenda.add(sweden.number("610267002"));
        companyDirectionAgenda.add(sweden.direction("Umea 241, gilteftr"));


        companyDirectionAgenda.forEach(System.out::println);
        companyPhoneAgenda.forEach(System.out::println);
    }
}

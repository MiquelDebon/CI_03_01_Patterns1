package S3_01_N2;

import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) {

        ArrayList<String> companyPhoneAgenda = new ArrayList<>();
        ArrayList<String> companyDirectionAgenda = new ArrayList<>();

        AgendaFactory agendaFactory = new AgendaFactory();

        Agenda spain = agendaFactory.getAgenda("Spain");
        companyPhoneAgenda.add(spain.number("610267001"));
        companyDirectionAgenda.add(spain.direction("C/Gracia 127, Barcelona"));


        companyDirectionAgenda.forEach(System.out::println);
        companyPhoneAgenda.forEach(System.out::println);
    }
}

package S3_01_N2_AbstractFactoryPattern.Intermediarios;

public interface Int_AbstractFactory {
    Int_Number getNumber(String country);
    Int_Direction agendaDirection(String country);

}

package S3_01_N2_AbstractFactoryPattern.Intermediarios;

public abstract class AbstractFactory {
    public abstract Int_Number getNumber(String country);
    public abstract Int_Direction agendaDirection(String country);

}

package S3_01_N2_AbstractFactoryPattern.Intermediarios;

public interface IAbstractFactory {
    INumber getNumber(String country);
    IDirection agendaDirection(String country);

}

package padroesestruturais_exercicios.facade;
public class Televisor extends Equipamento{
    private static Televisor televisor = new Televisor();

    private Televisor() {};

    public static Televisor getInstancia() {
        return televisor;
    }
}

package padroesestruturais_exercicios.facade;

public class Amplificador extends Equipamento{
    private static Amplificador amplificador = new Amplificador();

    private Amplificador() {};

    public static Amplificador getInstancia() {
        return amplificador;
    }
}

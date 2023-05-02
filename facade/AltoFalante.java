package padroesestruturais_exercicios.facade;


public class AltoFalante extends Equipamento{

    private static AltoFalante altoFalante = new AltoFalante();

    private AltoFalante() {};

    public static AltoFalante getInstancia() {
        return altoFalante;
    }
}

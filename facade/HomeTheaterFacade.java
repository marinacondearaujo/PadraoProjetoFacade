package padroesestruturais_exercicios.facade;

import padroesestruturais_exercicios.facade.HomeTheater;
import padroesestruturais_exercicios.facade.Amplificador;
import padroesestruturais_exercicios.facade.AltoFalante;
import padroesestruturais_exercicios.facade.Televisor;

public class HomeTheaterFacade {
    public static boolean verificarPendencias(HomeTheater homeTheater) {
        if (Amplificador.getInstancia().verificarHomeTheaterComPendencia(homeTheater)) {
            return false;
        }
        if (AltoFalante.getInstancia().verificarHomeTheaterComPendencia(homeTheater)) {
            return false;
        }
        if (Televisor.getInstancia().verificarHomeTheaterComPendencia(homeTheater)) {
            return false;
        }
        return true;
    }
}

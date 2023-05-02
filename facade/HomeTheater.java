package padroesestruturais_exercicios.facade;

import java.text.Normalizer;
public class HomeTheater {
    public boolean assistir() {
        return HomeTheaterFacade.verificarPendencias(this);
    }
}

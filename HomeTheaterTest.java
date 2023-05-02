package padroesestruturaisteste_exercicios.facade;

import org.junit.jupiter.api.Test;
import padroesestruturais_exercicios.facade.HomeTheater;
import padroesestruturais_exercicios.facade.Amplificador;
import padroesestruturais_exercicios.facade.AltoFalante;
import padroesestruturais_exercicios.facade.Televisor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeTheaterTest {
    @Test
    void deveRetornarPendenciaAmplificadorHomeTheater() {
        HomeTheater homeTheater = new HomeTheater();
        Amplificador.getInstancia().addEquipamentoPendente(homeTheater);

        assertEquals(false, homeTheater.assistir());
    }

    @Test
    void deveRetornarPendenciaAltoFalanteHomeTheater() {
        HomeTheater homeTheater = new HomeTheater();
        AltoFalante.getInstancia().addEquipamentoPendente(homeTheater);

        assertEquals(false, homeTheater.assistir());
    }

    @Test
    void deveRetornarPendenciaTelevisorHomeTheater() {
        HomeTheater homeTheater = new HomeTheater();
        Televisor.getInstancia().addEquipamentoPendente(homeTheater);

        assertEquals(false, homeTheater.assistir());
    }

    @Test
    void deveRetornarHomeTheaterSemPendencia() {
        HomeTheater homeTheater = new HomeTheater();

        assertEquals(true, homeTheater.assistir());
    }
}

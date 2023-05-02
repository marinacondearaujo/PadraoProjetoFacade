package padroesestruturais_exercicios.facade;


import java.util.ArrayList;
import java.util.List;

public class Equipamento {
    private List<HomeTheater> alunosComPendencia = new ArrayList<HomeTheater>();

    public void addEquipamentoPendente(HomeTheater homeTheater) {
        this.alunosComPendencia.add(homeTheater);
    }

    public boolean verificarHomeTheaterComPendencia(HomeTheater homeTheater) {return this.alunosComPendencia.contains(homeTheater);
    }
}

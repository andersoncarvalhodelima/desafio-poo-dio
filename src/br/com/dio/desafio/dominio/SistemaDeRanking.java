package br.com.dio.desafio.dominio;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeRanking {
    private List<Dev> devs = new ArrayList<>();

    public void cadastrarDev(Dev dev){
        devs.add(dev);
    }

    public void exibirRanking(){
        devs.sort((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()));
        System.out.println("Ranking de Devs por XP:");
        for (int i = 0; i< devs.size(); i++){
            Dev dev = devs.get(i);
            System.out.printf("%dº - %s: %.2f XP\n", (i + 1), dev.getNome(), dev.calcularTotalXp());
        }
    }
}

package ADO5RECURS;

import java.util.ArrayList;

public class PartidaFutebol {


    public void registrarGol(String time, String jogador, int camisa, ArrayList<Jogador> gols) {
        Jogador jogador2 = new Jogador(time, jogador, camisa);
        gols.add(jogador2);

        System.out.println("Jogador que marcou: " + jogador2.getNome());
        System.out.println("Número da camisa: " + jogador2.getCamisa());
    }

    public void resultado(String timeMandante, String timeVisitante, ArrayList<Jogador> gols) {
        System.out.println("Jogo encerrado!");
        System.out.println(timeMandante + "(" + contarGols(gols, timeMandante) + ") x ("+ contarGols(gols, timeVisitante) + ") "+ timeVisitante);
        exibirJogadores(gols, timeMandante);
        System.out.println();
        exibirJogadores(gols, timeVisitante);

    }

    public int contarGols(ArrayList<Jogador> gols, String time) {
        int soma = 0;
        for (Jogador jogador : gols) {
            if (jogador.getTime().equalsIgnoreCase(time)) {
                soma++;
            }
        }

        return soma;
    }
    public void exibirJogadores(ArrayList<Jogador> gols, String time) {
        System.out.println("Time -> " + time);
        for (Jogador jogador : gols) {
            if (jogador.getTime().equalsIgnoreCase(time)) {
                System.out.println(jogador.getCamisa() + " - " + jogador.getNome());
            }
        }
    }
}

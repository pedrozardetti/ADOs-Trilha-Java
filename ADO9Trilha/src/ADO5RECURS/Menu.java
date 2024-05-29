package ADO5RECURS;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Jogador> gols = new ArrayList<>();
    public static PartidaFutebol partida = new PartidaFutebol();

    public static void main(String[] args) {
        System.out.println("Bem-vindo à partida de futebol");

        System.out.println("Quem é o time mandante?");
        String timeMandante = sc.nextLine();

        System.out.println("Quem é o time visitante?");
        String timeVisitante = sc.nextLine();

        menu(timeMandante, timeVisitante);

    }

    public static void menu(String timeMandante, String timeVisitante) {

        int opcao = -1;

        System.out.println("\n1. Gol do mandante");
        System.out.println("2. Gol do visitante");
        System.out.println("0. Partida encerrada");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual jogador marcou o gol?");
                sc.nextLine();
                String jogador = sc.nextLine();

                System.out.println("Qual a camisa desse jogador?");
                int camisa = sc.nextInt();

                Jogador jogo = new Jogador(timeMandante, jogador, camisa);
                partida.registrarGol(timeMandante, jogador, camisa, gols);
                break;
            case 2:
                System.out.println("Qual jogador marcou o gol?");
                sc.nextLine();
                String jogadorVisitante = sc.nextLine();

                System.out.println("Qual a camisa desse jogador?");
                int camisaVisitante = sc.nextInt();

                partida.registrarGol(timeVisitante, jogadorVisitante, camisaVisitante, gols);
                break;
            case 0:
                System.out.println("A partida foi encerrada!");
                partida.resultado(timeMandante, timeVisitante, gols);
                return;

        }
        menu(timeMandante, timeVisitante);

    }
}

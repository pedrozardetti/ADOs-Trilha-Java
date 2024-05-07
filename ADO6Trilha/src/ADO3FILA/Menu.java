package ADO3FILA;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();

        int opcao = 0;

        do {
            System.out.println("\nWelcome to the garage system!");
            System.out.println("1. Adicionar carro à fila de espera");
            System.out.println("2. Próximo carro na fila");
            System.out.println("3. Listar todas as vagas");
            System.out.println("4. Consultar tempo médio de espera");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nInforme a placa do veículo (Quatro letras e três números)");
                    sc.nextLine();
                    String placa = sc.nextLine();

                    System.out.println("\nInforme o tipo do veículo");
                    String tipoCarro = sc.nextLine();

                    System.out.println("\nQual o ano do veículo?");
                    int ano = sc.nextInt();

                    Carros carros = new Carros(placa, tipoCarro, ano);
                    estacionamento.entradaVeiculo(carros);
                    break;

                case 2:
                    estacionamento.saidaVeiculo();
                    break;

                case 3:
                    estacionamento.listarVagas();
                    break;

                case 4:
                    estacionamento.verTempoEspera();
                    break;
            }
        } while (opcao != 0);
        System.out.println("U just left our system :(");
    }
}

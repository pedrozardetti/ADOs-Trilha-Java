package ADO6RECURS;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static Investimento investimento = new Investimento();

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {

        int opcao;

        System.out.println("-- Bem vindo ao sistema de gerenciamento de ações! --");
        System.out.println("1. Adicionar Ação");
        System.out.println("2. Atualizar Ação");
        System.out.println("3. Listar Ações");
        System.out.println("0. Sair do programa");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o código da ação");
                sc.nextLine();
                String codigo = sc.nextLine();

                System.out.println("Informe seu preço");
                double preco = sc.nextDouble();

                Acoes acoes = new Acoes(codigo, preco);
                investimento.adicionarAcao(acoes);
                break;
            case 2:
                System.out.println("Informe o código da ação que deseja atualizar");
                sc.nextLine();
                String codAtualizar = sc.nextLine();

                System.out.println("Informe o novo preço");
                double novoPreco = sc.nextDouble();

                investimento.atualizarAcao(codAtualizar, novoPreco);
                break;
            case 3:
                investimento.listarAcao();
                break;
            case 0:
                return;
        }
        menu();
    }

}

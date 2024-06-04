package ADO7HASH;

import java.util.Scanner;

public class Main {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Investimento investimento = new Investimento();
        Scanner ler = new Scanner(System.in);

        int opcao = 0;

        do {
            opcao = menu();
            
            if (opcao == 1) {
                investimento.adicionarAcao();
            } else if (opcao == 2) {
                investimento.atualizarAcao();
            } else if (opcao == 3) {
                investimento.listarAcoes();
            }

        } while (opcao != 0);

    }

    public static int menu() {
        System.out.println("1. Adicionar acao");
        System.out.println("2. Atualizar acao");
        System.out.println("3. Listar acao");
        System.out.println("0. Sair do programa");
        return ler.nextInt();
    }
}

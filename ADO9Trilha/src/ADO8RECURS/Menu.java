package ADO8RECURS;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static FastFood fast = new FastFood();

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        int opcao = 0;

        System.out.println("\n-- BEM VINDO AO SISTEMA DE FAST-FOOD --");
        System.out.println("1. Novo Pedido");
        System.out.println("2. Alterar Situação Pedido");
        System.out.println("3. Listar em Andamento");
        System.out.println("4. Listar Finalizados");
        System.out.println("5. Listar Entregues");
        System.out.println("6. Remover");
        System.out.println("0. Sair");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual o número do seu pedido?");
                int numero = sc.nextInt();

                System.out.println("Informe seu nome");
                sc.nextLine();
                String nome = sc.nextLine();

                Pedido pedido = new Pedido(numero, nome);
                fast.novoPedido(pedido);
                break;

            case 2:
                System.out.println("Qual número do pedido?");
                int numeroAlterar = sc.nextInt();

                System.out.println("Para qual situação gostaria de alterar o pedido?");
                System.out.println("-- Nova Situação: --");
                System.out.println("1. Em Andamento");
                System.out.println("2. Finalizado");
                System.out.println("3. Entregue");
                sc.nextLine();
                String situacao = sc.nextLine();

                fast.alterarSit(numeroAlterar, situacao);
                break;

            case 3:
                fast.andamento();
                break;

            case 4:
                fast.finalizados();
                break;

            case 5:
                fast.entregue();
                break;

            case 6:
                System.out.println("Qual pedido você deseja remover?");
                int removerPedido = sc.nextInt();
                fast.remover(removerPedido);
                break;

            case 0:
                return;
        }

        menu();

    }

}

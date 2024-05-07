package ADO2FILA;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Atendimento atendimento = new Atendimento();
        int opcao;

        do {
            System.out.println("\nBEM VINDO AO ATENDIMENTO DO BANCO");
            System.out.println("1. Adicionar novo cliente à fila");
            System.out.println("2. Atender próximo cliente da fila");
            System.out.println("3. Listar todos os clientes da fila");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do cliente");
                    String nome = sc.nextLine();

                    System.out.println("Qual a prioridade do atendimento? (Comum/Preferencial)");
                    String prioridade = sc.nextLine();
                
                    System.out.println("O número de identificação foi gerado automaticamente!");

                    Cliente cliente = new Cliente(nome, prioridade);
                    atendimento.addCliente(cliente);

                    break;

                case 2: 
                    atendimento.proxCliente();
                    break;

                case 3: 
                    atendimento.listarCliente();
                    break;
            }
            System.out.println();
        } while (opcao != 0);
        System.out.println("Você saiu do programa :)");

    }
}

package ADO1FILA;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


        Lanchonete lanchonete = new Lanchonete();

        int opcao;

        do {
            System.out.println("BEM-VINDO À LANCHONETE");
            System.out.println("1. Adicionar novo pedido à fila");
            System.out.println("2. Atender o próximo pedido da fila");
            System.out.println("3. Listar todos os pedidos na fila");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:

                    System.out.println("Insira o nome");
                    sc.nextLine();
                    String nome = sc.nextLine();
                  

                    System.out.println("Insira o preço");
                    double preco = sc.nextDouble();
                    

                    ItemPedido novoItem = new ItemPedido(nome, preco);
                    lanchonete.adicionarPedido(novoItem);
                    break;

                case 2:
                    lanchonete.proximoPedido();
                    break;

                case 3:
                    lanchonete.listarPedidos();
                    break;

            }
        } while (opcao != 0);
        System.out.println("Você saiu do programa");
    }
}

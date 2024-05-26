package ADO2;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        int opcao = 0;

        do {
            System.out.println("\nSeja bem vindo ao nosso sistema");
            System.out.println("1. Adicionar um produto ao inventário");
            System.out.println("2. Remover um produto do inventário");
            System.out.println("3. Listar todos os produtos do inventário");
            System.out.println("4. Buscar um produto pelo seu nome");
            System.out.println("5. Atualizar a quantidade de um produto no inventário");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do produto");
                    String nome = sc.nextLine();

                    System.out.println("Informe o código do produto (número único)");
                    int cod = sc.nextInt();

                    System.out.println("Informe a quantidade em estoque");
                    int qtd = sc.nextInt();

                    System.out.println("Informe o preço do produto");
                    double preco = sc.nextDouble();

                    Produto prod = new Produto(nome, cod, qtd, preco);
                    inventario.adicionarProduto(prod);
                    break;
                case 2:
                    System.out.println("Informe o código do produto!");
                    int removerCod = sc.nextInt();
                    inventario.removerProduto(removerCod);
                    break;
                case 3:
                    inventario.listarProduto();
                    break;
                case 4:
                    System.out.println("Informe o nome do produto para fazer a busca");
                    String buscaNome = sc.nextLine();
                    inventario.buscarProduto(buscaNome);
                    break;
                case 5:
                    System.out.println("Informe o código do produto que você deseja alterar a quantidade");
                    int codAlterar = sc.nextInt();
                    System.out.println("Informe a quantidade para que deseja alterar");
                    int alterarQtd = sc.nextInt();
                    inventario.atualizarQtd(codAlterar, alterarQtd);
                    break;

            }
        } while (opcao != 0);
        System.out.println("Você saiu da nossa loja!");
    }
}

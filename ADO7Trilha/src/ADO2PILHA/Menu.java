package ADO2PILHA;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        int opcao = 0;

        do {
            System.out.println("Bem vindo ao nosso sistema de devolução de livros");
            System.out.println("1. Inserir um novo livro para devolver");
            System.out.println("2. Processar a devolução do livro");
            System.out.println("3. Visualizar o livro do topo da pilha");
            System.out.println("4. Contar o número de livros na pilha");
            System.out.println("5. Listar todos livros");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o título do livro");
                    sc.nextLine();
                    String titulo = sc.nextLine();

                    System.out.println("\nInforme o autor do livro");
                    String autor = sc.nextLine();

                    System.out.println("\nInforme o ano da publicação do livro");
                    int anoPublicacao = sc.nextInt();

                    Livro livro = new Livro(titulo, autor, anoPublicacao);
                    biblioteca.adicionarLivro(livro);

                    break;

                case 2:
                    biblioteca.processarDevolucao();
                    break;

                case 3:
                    biblioteca.visualizarTopo();
                    break;

                case 4:
                    biblioteca.contarPilha();
                    break;

                case 5:
                    biblioteca.listarTodos();
                    break;
            }
        } while (opcao != 0);
        System.out.println("Você saiu do programa!");
    }
}

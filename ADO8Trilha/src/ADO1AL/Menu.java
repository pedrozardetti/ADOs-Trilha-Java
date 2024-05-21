package ADO1;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        int opcao = 0;

        do {
            System.out.println("\nSeja bem-vindo à biblioteca");
            System.out.println("1. Adicionar livros");
            System.out.println("2. Remover livros");
            System.out.println("3. Listar livros");
            System.out.println("4. Buscar livros");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Informe o título do livro");
                    String titulo = sc.nextLine();

                    System.out.println("Informe o nome do autor");
                    String autor = sc.nextLine();

                    System.out.println("Informe o ano de publicação do livro");
                    int anoPublicacao = sc.nextInt();
                    sc.nextLine();

                    Livro livro = new Livro(titulo, autor, anoPublicacao);
                    biblioteca.adicionarLivro(livro);

                    break;

                case 2:
                    System.out.println("Informe o livro a ser removido");
                    String removerLivro = sc.nextLine();
                    biblioteca.removerLivro(removerLivro);
                    break;

                case 3:
                    biblioteca.listarLivro();
                    break;

                case 4:
                    System.out.println("Informe o livro que deseja buscar");
                    String buscarLivro = sc.nextLine();
                    biblioteca.buscarLivro(buscarLivro);
                    break;
            }
        } while (opcao != 0);
        System.out.println("Você saiu da nossa biblioteca!");
    }
}


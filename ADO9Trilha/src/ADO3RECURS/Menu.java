package ADO3RECURS;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca(); // Biblioteca compartilhada

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {

        System.out.println("\nBem vindo à biblioteca");
        System.out.println("1. Adicionar livro");
        System.out.println("2. Remover livro");
        System.out.println("3. Listar livros");
        System.out.println("4. Buscar livro");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Informe o nome do livro que você quer adicionar");
                String titulo = sc.nextLine();

                System.out.println("Informe o autor do livro");
                String autor = sc.nextLine();

                System.out.println("Informe o ano de publicação");
                int anoPublicacao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer do scanner
                Livros livros = new Livros(titulo, autor, anoPublicacao);
                biblioteca.addLivro(livros);
                break;
            case 2:
                System.out.println("Informe o título do livro para remover!");
                String remover = sc.nextLine();
                biblioteca.removerLivro(remover);
                break;
            case 3:
                biblioteca.listarLivro();
                break;
            case 4:
                System.out.println("Informe o nome do livro que você deseja buscar!");
                String buscar = sc.nextLine();
                biblioteca.buscarLivro(buscar);
                break;
            case 5:
                System.out.println("Saindo!");
                return; // Sai da recursão e termina o programa
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
        exibirMenu(); // Chama recursivamente o menu
    }
}

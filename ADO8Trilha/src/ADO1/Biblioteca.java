package ADO1;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> lista = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        lista.add(livro);
        System.out.println("O seu livro foi adicionado com sucesso!");
        System.out.println("\nLivro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
    }

    public void removerLivro(String titulo) {
        for (Livro livro : lista) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                lista.remove(livro);
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivro() {
        if (!lista.isEmpty()) {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : lista) {
                System.out.println(livro);
            }
        } else {
            System.out.println("Não há mais livros.");
        }
    }

    public void buscarLivro(String titulo) {
        for (Livro livro : lista) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado! -> " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }
}


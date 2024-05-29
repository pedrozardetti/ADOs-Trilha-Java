package ADO3RECURS;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livros> lista = new ArrayList<>();

    public void addLivro(Livros livros) {
        lista.add(livros);
        System.out.println("O seu livro foi adicionado à nossa prateleira!");
        System.out.println("Título do livro: " + livros.getTitulo());
        System.out.println("Autor do livro: " + livros.getAutor());
        System.out.println("Ano de publicação: " + livros.getAnoPublicacao());
    }

    public void removerLivro(String remover) {
        for (Livros livros : lista) {
            if (livros.getTitulo().equalsIgnoreCase(remover)) {
                lista.remove(livros); // Corrigido para remover o objeto Livros
                System.out.println("Livro com o nome de " + livros.getTitulo() + " foi removido com sucesso!");
                return; // Sai do método após remover o livro
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void listarLivro() {
        if (!lista.isEmpty()) {
            System.out.println("Livros da biblioteca:");
            for (Livros livros : lista) {
                System.out.println(livros);
            }
        } else {
            System.out.println("Não temos mais livros para listar");
        }
    }

    public void buscarLivro(String buscar) {
        for (Livros livros : lista) {
            if (livros.getTitulo().equalsIgnoreCase(buscar)) {
                System.out.println("Seu livro foi encontrado! -> " + livros.getTitulo());
                return; // Sai do método após encontrar o livro
            }
        }
        System.out.println("Não temos mais esse livro!");
    }
}


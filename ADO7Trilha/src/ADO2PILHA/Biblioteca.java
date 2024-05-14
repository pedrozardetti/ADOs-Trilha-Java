package ADO2PILHA;

import java.util.Stack;

public class Biblioteca {

    private Stack<Livro> pilhaLivros = new Stack<>();

    public void adicionarLivro(Livro livro) {
        pilhaLivros.push(livro);
        System.out.println("\n[INFO] O livro foi adicionado à fila de devolução!\n");
    }

    public void processarDevolucao() {
        if (!pilhaLivros.isEmpty()) {
            Livro livro = pilhaLivros.pop();
            System.out.println("\n[INFO] O livro foi processado para devolução!\n");
            imprimirLivro(livro);
        } else {
            System.out.println("\n[AVISO] Não há mais livros para devolução no momento :(\n");
        }
    }

    public void visualizarTopo() {
        if (!pilhaLivros.isEmpty()) {
            Livro livro = pilhaLivros.peek();
            System.out.println("\n[INFO] O livro que está no topo é:");
            imprimirLivro(livro);
        } else {
            System.out.println("\n[AVISO] Não temos mais nenhum livro para devolver :(\n");
        }
    }

    public void contarPilha() {
        if (!pilhaLivros.isEmpty()) {
            System.out.println("\n[INFO] O tamanho atual da pilha é de: " + pilhaLivros.size() + "\n");
        } else {
            System.out.println("\n[AVISO] Nossa pilha acabou :(\n");
        }
    }

    public void listarTodos() {
        if (!pilhaLivros.isEmpty()) {
            System.out.println("\n[INFO] Listando todos os livros:\n");
            for (Livro livro : pilhaLivros) {
                imprimirLivro(livro);
            }
        } else {
            System.out.println("\n[AVISO] Não temos mais livros para listar :)\n");
        }
    }

    private void imprimirLivro(Livro livro) {
        System.out.println("------------------------------");
        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("Autor do livro: " + livro.getAutor());
        System.out.println("Ano de publicação do livro: " + livro.getAnoPublicacao());
        System.out.println("------------------------------\n");
    }
}


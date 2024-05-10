package ADO1PILHA;

import java.util.Stack;

public class SistemaDocumentos {

    Stack<Documento> sistema = new Stack<>();

    public void adicionarDocumento(Documento doc) {
        sistema.push(doc);
        System.out.println("\nO seu documento foi adicionado com sucesso!");
        System.out.println("Características do documento:");
        System.out.println("------------------------------");
        System.out.println("Nome: " + doc.getNome());
        System.out.println("Tipo: " + doc.getTipo());
        System.out.println("Conteúdo: " + doc.getConteudo());
    }

    public void removerDocumento() {
        if (!sistema.isEmpty()) {
            Documento remove = sistema.pop();
            System.out.println("O documento pelo nome de " + remove.getNome() + "foi removido!");

        } else {
            System.out.println("Não há documentos na pilha!");
        }
    }

    public void listarDocumento() {
        if (sistema.isEmpty()) {
            System.out.println("Não há mais documentos para exibir!");
        } else {
            System.out.println("-- Listando todos os documentos --");
            for (Documento documento : sistema) {
                System.out.println("Nome: " + documento.getNome());
                System.out.println("Nome: " + documento.getTipo());
                System.out.println("Conteúdo: " + documento.getConteudo());

            }
            System.out.println("----------------------------------");

        }
    }

    public void tamanhoPilha() {
        if (sistema.isEmpty()) {
            System.out.println("A pilha no momento se encontra vazia");
        } else {
            System.out.println("O tamanho da pilha é de " + sistema.size() + " documentos");
        }
    }

    public void documentoMaisAntigo() {
        if (sistema.isEmpty()) {
            System.out.println("Não há documentos na pilha!");
        } else {
            Documento maisAntigo = sistema.lastElement();
            System.out.println("Documento mais antigo:");
            System.out.println("Nome: " + maisAntigo.getNome());
            System.out.println("Tipo: " + maisAntigo.getTipo());
            System.out.println("Conteúdo: " + maisAntigo.getConteudo());
        }

    }
}

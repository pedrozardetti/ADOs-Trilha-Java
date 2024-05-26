package ADO2;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Produto> item = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        item.add(produto);
        System.out.println("O seu produto foi adicionado com sucesso!");
        System.out.println("---------------------------------");
        System.out.println("\nNome - " + produto.getNome());
        System.out.println("Código - " + produto.getCod());
        System.out.println("Quantidade - " + produto.getQtd());
        System.out.println("Preço - R$ " + produto.getPreco());
    }

    public void removerProduto(int removerCod) {
        if (!item.isEmpty()) {
            for (Produto produto : item) {
                if (produto.getCod() == removerCod) {
                    item.remove(produto);
                    System.out.println("O produto com o código " + removerCod + " foi removido com sucesso!");
                    return;
                }
            }
            System.out.println("Produto com o código " + removerCod + " não encontrado.");
        } else {
            System.out.println("Não há mais nenhum produto no inventário para ser removido!");
        }
    }

    public void listarProduto() {
        if (!item.isEmpty()) {
            System.out.println("Produtos no inventário ->");
            for (Produto produto : item) {
                System.out.println(produto);
            }
        } else {
            System.out.println("Não há mais produtos no inventário a serem listados!");
        }
    }

    public void buscarProduto(String buscaNome) {
        for (Produto produto : item) {
            if (produto.getNome().equalsIgnoreCase(buscaNome)) {
                System.out.println("Produto encontrado no inventário! :)");
                System.out.println("Aqui estão as informações dele:");
                System.out.println("Nome - " + produto.getNome());
                System.out.println("Código - " + produto.getCod());
                System.out.println("Quantidade - " + produto.getQtd());
                System.out.println("Preço - R$ " + produto.getPreco());
                return;
            }
        }
        System.out.println("Produto com o nome " + buscaNome + " não encontrado.");
    }

    public void atualizarQtd(int codAlterar, int alterarQtd) {
        if (!item.isEmpty()) {
            for (Produto produto : item) {
                if (produto.getCod() == codAlterar) {
                    produto.setQtd(alterarQtd);
                    System.out.println("A quantidade do produto com código " + produto.getCod() + " foi atualizada para " + produto.getQtd() + ".");
                    return;
                }
            }
            System.out.println("Produto com o código " + codAlterar + " não encontrado.");
        } else {
            System.out.println("A lista de produtos está vazia.");
        }
    }
}

package ADO6RECURS;

import java.util.ArrayList;

public class Investimento {

    ArrayList<Acoes> corretora = new ArrayList<>();

    public void adicionarAcao(Acoes acoes) {
        corretora.add(acoes);
        System.out.println("Sua ação foi adicionada com sucesso!");
        System.out.println(acoes.getCodigo() + " - " + acoes.getPreco());
    }

    public void atualizarAcao(String codAtualizar, double novoPreco) {
        for (Acoes acoes : corretora) {
            if (acoes.getCodigo().equalsIgnoreCase(codAtualizar)) {
                if (acoes.getPreco() < novoPreco) {
                    System.out.println("<< A ação subiu em " + (novoPreco - acoes.getPreco()));
                    acoes.setPreco(novoPreco);
                } else {
                    System.out.println("<< A ação desceu em " + (acoes.getPreco() - novoPreco));
                    acoes.setPreco(novoPreco);
                }
            } else
                System.out.println("Não temos ações para atualizar ainda!");
        }

    }

    public void listarAcao() {
        if (!corretora.isEmpty()) {
            System.out.println("-- AÇÕES --");
            for (Acoes acoes : corretora) {
                System.out.println(acoes);
            }

        } else
            System.out.println("Ainda não temos ações a serem listadas!");
    }
}

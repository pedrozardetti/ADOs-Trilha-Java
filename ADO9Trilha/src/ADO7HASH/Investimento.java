package ADO7HASH;

import java.util.*;

public class Investimento {
    public HashMap<String, Double> corretora = new HashMap<>();

    public void adicionarAcao() {
        String codigo = Ui.pedirCodigo("Informe o codigo da acao");
        Double valor = Ui.pedirPreco("Informe o preco da acao");

        Double value = corretora.putIfAbsent(codigo, valor);

        if (value != null) {
            System.out.println("Ja existe esse codigo!");
            return;
        }
        System.out.println("Acao adicionada com sucesso!");
    }

    public void atualizarAcao() {
        String codigo = Ui.pedirCodigo("Informe o codigo a ser atualizado");

        Double valor = Ui.pedirPreco("Informe o novo preco");

        for (String key : corretora.keySet()) {
            Double value = corretora.get(key);
            value = valor;
            corretora.replace(key, value);
        }

        System.out.println("Atualizado com sucesso" + corretora.get(codigo));

    }


    public void listarAcoes() {
        for (Map.Entry<String, Double> entry : corretora.entrySet()) {
            System.out.println("CODIGO DA ACAO -> "+entry.getKey());
            System.out.println("PRECO DA ACAO -> "+entry.getValue());
        }
    }
}

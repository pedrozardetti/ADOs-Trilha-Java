package ADO8RECURS;

import java.util.ArrayList;
import java.util.Iterator;

public class FastFood {

    ArrayList<Pedido> comida = new ArrayList<>();

    public void novoPedido(Pedido pedido) {
        comida.add(pedido);
        System.out.println("O seu pedido foi adicionado!");
        System.out.println("Nome: " + pedido.getNome());
        System.out.println("Pedido: " + pedido.getNumero());
    }

    public void alterarSit(int numeroAlterar, String situacao) {
        for (Pedido pedido : comida) {
            if (numeroAlterar == pedido.getNumero()) {
                if (pedido.getSituacao().equalsIgnoreCase("Em andamento")) {
                    pedido.setSituacao(situacao);
                    System.out.println("O pedido de número " + pedido.getNumero() + " de " + pedido.getNome()
                            + " encontra-se em: " + pedido.getSituacao());
                } else if (pedido.getSituacao().equalsIgnoreCase("Finalizado")) {
                    pedido.setSituacao(situacao);
                    System.out.println("O pedido de número " + pedido.getNumero() + " de " + pedido.getNome()
                            + " encontra-se em: " + pedido.getSituacao());
                } else if (pedido.getSituacao().equalsIgnoreCase("Entregue")) {
                    pedido.setSituacao(situacao);
                    System.out.println("O pedido de número " + pedido.getNumero() + " de " + pedido.getNome()
                            + " encontra-se em: " + pedido.getSituacao());
                } else {
                    System.out.println("Não temos pedidos para alterar a situação :(");
                }

            }
        }
    }

    public void andamento() {
        if (!comida.isEmpty()) {
            System.out.println("Listando todos pedidos em andamento");
            for (Pedido pedido : comida) {
                if (pedido.getSituacao().equalsIgnoreCase("Em andamento")) {
                    System.out.println(pedido);
                }
            }
        } else
            System.out.println("Não temos pedidos em andamento no momento!");

    }

    public void finalizados() {
        if (!comida.isEmpty()) {
            System.out.println("Listando todos pedidos finalizados");
            for (Pedido pedido : comida) {
                if (pedido.getSituacao().equalsIgnoreCase("Finalizado")) {
                    System.out.println(pedido);
                }
            }
        } else
            System.out.println("Não temos pedidos finalizados no momento!");
    }

    public void entregue() {
        if (!comida.isEmpty()) {
            System.out.println("Listando todos pedidos entregues");
            for (Pedido pedido : comida) {
                if (pedido.getSituacao().equalsIgnoreCase("Entregue")) {
                    System.out.println(pedido);
                }
            }
        } else
            System.out.println("Não temos pedidos entregues no momento!");
    }

    public void remover(int removerPedido) {
        Iterator<Pedido> iterator = comida.iterator();
        while (iterator.hasNext()) {
            Pedido pedido = iterator.next();
            if (removerPedido == pedido.getNumero()) {
                iterator.remove();
                System.out.println("O pedido de número " + pedido.getNumero() + " foi removido com sucesso");
                return;
            }
        }
        System.out.println("Não há pedidos a serem removidos");
    }
}

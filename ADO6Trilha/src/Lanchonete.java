import java.util.ArrayDeque;
import java.util.Queue;

public class Lanchonete {

    private Queue<ItemPedido> pedidos = new ArrayDeque<>();

    public void adicionarPedido(ItemPedido item) {
        pedidos.offer(item);
        System.out.println("O pedido foi realizado com sucesso!");
        System.out.println("Nome: " + item.getNome());
        System.out.println("Preço: R$" + item.getPreco());
    }

    public void proximoPedido() {
        if (!pedidos.isEmpty()) {
            ItemPedido proximo = pedidos.poll();
            System.out.println("Chamando próximo pedido de um " + proximo.getNome());
        } else {
            System.out.println("Não há pedidos na fila.");
        }
    }

    public void listarPedidos() {
        System.out.println("--- Lista de Pedidos ---");
        for (ItemPedido itemPedido : pedidos) {
            System.out.println("Nome: " + itemPedido.getNome());
            System.out.println("Preço: R$" + itemPedido.getPreco());
        }

    }
}

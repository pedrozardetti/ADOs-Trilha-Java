package ADO2FILA;

import java.util.ArrayDeque;
import java.util.Queue;

public class Atendimento {

    private Queue<Cliente> banco = new ArrayDeque<>();

    public void addCliente(Cliente cliente) {
        banco.offer(cliente);
        System.out.println("O cliente foi adicionado com êxito");
        System.out.println("\nID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Prioridade : " + cliente.getPrioridade());

    }

    public void proxCliente() {
        if (!banco.isEmpty()) {
            Cliente prox = null;
           
            for (Cliente cliente : banco) {
                if (cliente.getPrioridade().equalsIgnoreCase("preferencial")) {
                    prox = cliente;
                    break; 
                }
            }
            
            if (prox == null) {
                prox = banco.poll();
            } else {
                banco.remove(prox); 
            }
            System.out.println("Chamando próximo cliente: " + prox.getNome());
        } else {
            System.out.println("Não há mais clientes na fila!");
        }
    }

    public void listarCliente() {
        if (banco.isEmpty()) {
            System.out.println("Não há clientes na fila.");
        } else {
            System.out.println("\nLista de clientes na fila:");
            for (Cliente cliente : banco) {
                System.out.println("ID: " + cliente.getId() + " | Nome: " + cliente.getNome() + " | Prioridade: " + cliente.getPrioridade());
            }
        }
    }
}    

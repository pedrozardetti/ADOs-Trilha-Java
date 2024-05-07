package ADO2FILA;

import java.util.UUID;

public class Cliente {
    
    private String nome;
    private String id;
    private String prioridade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Cliente(String nome, String prioridade) {
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
        this.prioridade = prioridade;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}

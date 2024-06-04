package ADO8RECURS;

public class Pedido {

    private int numero;
    private String nome;
    private String situacao;

    public Pedido(int numero, String nome) {
        this.situacao = "Em andamento";
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Pedido: Número - " + numero + " | Nome - " + nome + " | Situação - " + situacao;
    }

}

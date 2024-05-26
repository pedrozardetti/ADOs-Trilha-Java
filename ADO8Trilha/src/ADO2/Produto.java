package ADO2;

public class Produto {

    private String nome;
    private int cod;
    private int qtd;
    private double preco;

    public Produto(String nome, int cod, int qtd, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto --> Nome = " + nome + ", Código =" + cod + ", Quantidade =" + qtd + ", Preço = R$ " + preco;
    }
}

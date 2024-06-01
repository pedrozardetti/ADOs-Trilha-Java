package ADO6RECURS;

public class Acoes {

    private String codigo;
    private double preco;

    public Acoes(String codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ações - Código -> " + codigo + " - Preço -> " + preco;
    }

    
}

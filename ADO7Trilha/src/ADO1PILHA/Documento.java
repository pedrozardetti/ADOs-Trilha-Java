package ADO1PILHA;

public class Documento {
    
    private String nome;
    private String tipo;
    private String conteudo;


    public Documento(String nome, String tipo, String conteudo) {
        this.nome = nome;
        this.tipo = tipo;
        this.conteudo = conteudo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}

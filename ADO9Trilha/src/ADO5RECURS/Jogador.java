package ADO5RECURS;

public class Jogador {

    private String time;
    private String nome;
    private int camisa;

    public Jogador(String time, String nome, int camisa) {
        this.time = time;
        this.nome = nome;
        this.camisa = camisa;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    @Override
    public String toString() {
        return "Jogador --> Time - " + time + ", Nome - " + nome + ", Camisa - " + camisa;
    }

    
}

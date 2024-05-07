package ADO3FILA;

public class Carros {

    private String placa;
    private String tipoCarro;
    private int ano;

    public Carros(String placa, String tipoCarro, int ano) {
        this.placa = placa;
        this.tipoCarro = tipoCarro;
        this.ano = ano;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

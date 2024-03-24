package exercicio1;

public class Lampada {

  String modelo;
  String tensao;
  int potencia;
  String cor;
  String tipoLuz;
  int garantiaMeses;
  String[] tipos;

  boolean tipoAbajur;
  boolean ligada;

  public void ligarLampada() {
    ligada = true;

  }

  public void desligarLampada() {
    ligada = false;
  }

  public void mostrarEstado() {
    if (ligada) {
      System.out.println("> A lâmpada está ligada <");
    } else
      System.out.println("> A lâmpada está desligada <");
  }

  public void mudarEstado() {
    if (ligada) {
      desligarLampada();
    } else {
      ligarLampada();
    }
  }
}

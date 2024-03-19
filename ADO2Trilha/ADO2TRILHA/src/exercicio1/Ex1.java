package exercicio1;

public class Ex1 {

  public static void main(String[] args) {

    Lampada lamp = new Lampada();
    lamp.modelo = "A60";
    lamp.tensao = "Bivolt";
    lamp.garantiaMeses = 36;
    lamp.potencia = 7;
    lamp.cor = "Amarela";
    lamp.tipoAbajur = true;

    lamp.tipos = new String[5];
    lamp.tipos[0] = "Abajur";
    lamp.tipos[1] = "Lampeões";

  }
}

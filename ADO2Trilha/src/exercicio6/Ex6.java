package exercicio6;

public class Ex6 {
  public static void main(String[] args) {

    Contato contato1 = new Contato();
    contato1.nome = "GABIEL RATAZANO";
    contato1.endereco = "Rua Engenheiro Antônio Alves Braga, 36";
    contato1.email = "gabriel.diasramos@hotmail.com";

    contato1.telefones = new String[5];
    contato1.telefones[0] = "98535-6473";
    contato1.telefones[1] = "95021-6699";
    contato1.telefones[2] = "98418-6662";

    System.out.println("Nome: " + contato1.nome);
    System.out.println("Endereço: " + contato1.endereco);
    System.out.println("Email: " + contato1.email);
    System.out.println("Telefones:");
    for (int i = 0; i < contato1.telefones.length; i++) {
      if (contato1.telefones[i] != null) {
        System.out.println(" - " + contato1.telefones[i]);
      }
    }
  }
}

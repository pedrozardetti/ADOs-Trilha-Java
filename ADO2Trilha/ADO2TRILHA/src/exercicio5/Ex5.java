package exercicio5;

public class Ex5 {
  public static void main(String[] args) {
    
    ContaCorrente conta = new ContaCorrente();
    conta.numeroConta = "565129";
    conta.agencia = "5301";
    conta.especial = true;
    conta.limiteEspecial = 75000;
    conta.saldo = 225;

    System.out.println(">> O Saldo da conta com o Número " + conta.numeroConta + " & Agência " + conta.agencia + " encontra-se em R$" + conta.saldo);

  }
}

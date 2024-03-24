package exercicio2;

public class Ex02 {
  public static void main(String[] args) {

    ContaCorrente conta = new ContaCorrente();
    conta.numeroConta = "565129";
    conta.saldo = -10;
    conta.especial = true;
    conta.limiteEspecial = 500;
    conta.valorEspecialUsado = 0;
    conta.agencia = 196776;

    System.out.println(">> O Saldo da conta com o Número " + conta.numeroConta + " & Agência " + conta.agencia
        + " encontra-se em R$" + conta.saldo);

    boolean saqueEfetuado = conta.realizarSaque(10);

    if (saqueEfetuado) {
      System.out.println("O saque foi efetuado com sucesso");
      conta.consultarSaldo();
    } else {
      System.out.println("Não foi possível realizar o saque. O saldo no momento é insuficiente");
    }

    saqueEfetuado = conta.realizarSaque(500);
    System.out.println("Tentativa de saque de R$500,00");
    if (saqueEfetuado) {
      System.out.println("O saque foi efetuado com sucesso");
      conta.consultarSaldo();
    } else {
      System.out.println("Não foi possível realizar o saque. O saldo no momento é insuficiente");
    }

    System.out.println("Depósito de R$500,00");
    conta.depositar(500);
    conta.consultarSaldo();

    if (conta.verificarChequeEspecial()) {
      System.out.println("Está usando cheque especial");
    } else {
      System.out.println("Não está usando cheque especial");
    }
  }
}

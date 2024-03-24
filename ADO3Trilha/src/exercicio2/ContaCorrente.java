package exercicio2;

public class ContaCorrente {

  String numeroConta;
  double saldo;
  boolean especial;
  double limiteEspecial;
  double valorEspecialUsado;
  double agencia;

  public boolean realizarSaque(double valorSacar) {

    if (saldo >= valorSacar) {
      saldo -= valorSacar;
      return true;
    } else {
      if (especial) {
        double limite = limiteEspecial + saldo;
        if (limite >= valorSacar) {
          saldo -= valorSacar;
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
  }

  public void depositar(double valorDepositado) {

    saldo += valorDepositado;
  }

  public void consultarSaldo() {
    System.out.println("Saldo atual da conta = " + saldo);
  }

  public boolean verificarChequeEspecial() {
    return saldo < 0;
    }
}

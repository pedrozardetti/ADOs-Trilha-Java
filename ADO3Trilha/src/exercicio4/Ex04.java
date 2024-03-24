package exercicio4;

import java.util.Scanner;

public class Ex04 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    JogoDaVelha jogoDaVelha = new JogoDaVelha();

    System.out.println("Jogador 1 = X");
    System.out.println("Jogador 2 = 0");

    boolean ganhou = false;
    char sinal;
    int linha = 0, coluna = 0;

    while (!ganhou) {

      if (jogoDaVelha.vezJogador1()) {

        System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
        sinal = 'X';
      } else {
        System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
        sinal = '0';
      }

      linha = valor("Linha", sc);
      coluna = valor("Coluna", sc);

      jogoDaVelha.validarJogada(linha, coluna, sinal);

      jogoDaVelha.imprimirTabuleiro();

      if (jogoDaVelha.verificarGanhador('X')) {
        ganhou = true;
        System.out.println("Parabéns, jogador 1 ganhou");
      } else if (jogoDaVelha.verificarGanhador('0')) {
        ganhou = true;
        System.out.println("Parabéns, jogador 2 ganhou");
      } else if (jogoDaVelha.jogada > 9) {
        ganhou = true;
        System.out.println("Ninguém ganhou essa partida");
      }
    }
  }

  public static int valor(String tipoValor, Scanner sc) {
    int valor = 0;
    boolean valorValida = false;
    while (!valorValida) {
      System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
      valor = sc.nextInt();
      if (valor >= 1 && valor <= 3) {
          valorValida = true;        
      } else {
        System.out.println("Entrada inválida, tente novamente");
      }
    }
    valor--;
    return valor;
  }
}
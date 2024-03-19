import java.util.Scanner;

public class Exercicio4 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int[] vetorA = new int[15];
    double[] vetorB = new double[vetorA.length];

    for (int i = 0; i < vetorB.length; i++) {

      System.out.println("Insira o valor da posição: " + i);
      vetorA[i] = sc.nextInt();

      vetorB[i] = Math.sqrt(vetorA[i]);
    }

    System.out.println("--> VETOR A <--");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println();

    System.out.println("--> Vetor B <--");
    for (int i = 0; i < vetorB.length; i++) {
      System.out.printf("%.2f ", vetorB[i]);
    }
    System.out.println();
  }
}

import java.util.Scanner;

public class Exercicio9 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];
    double[] vetorC = new double[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Insira o valor da posição: " + i);
      vetorA[i] = sc.nextInt();
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Insira o valor da posição: " + i);
      vetorB[i] = sc.nextInt();

      vetorC[i] = vetorA[i] / (vetorB[i]);
    }

    System.out.println("--> VETOR A <--");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println();

    System.out.println("--> VETOR B <--");
    for (int i = 0; i < vetorB.length; i++) {
      System.out.print(vetorB[i] + " ");
    }
    System.out.println();

    System.out.println("--> VETOR C <--");
    for (int i = 0; i < vetorC.length; i++) {
      System.out.printf("%.2f ", vetorC[i]);

    }
  }

}

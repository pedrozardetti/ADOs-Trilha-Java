import java.util.Scanner;

public class Exercicio5 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Insira o valor da posição: " + i);
      vetorA[i] = sc.nextInt();

      vetorB[i] = vetorA[i] * i;

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
  }
}

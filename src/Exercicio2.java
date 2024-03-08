import java.util.Scanner;

public class Exercicio2 {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
    int[] vetorA = new int[8];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorB.length; i++) {
      
      System.out.println("Informe o valor da posição: " +i);
      vetorA[i] = sc.nextInt();

      vetorB[i] = vetorA[i] * 2;

    }

    System.out.println("Vetor A --> ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B --> ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();


  }
}

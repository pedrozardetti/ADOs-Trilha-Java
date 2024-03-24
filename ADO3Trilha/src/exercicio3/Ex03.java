package exercicio3;

import java.util.Scanner;

public class Ex03 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Aluno aluno = new Aluno();

    System.out.println("Informe o nome do aluno");
    aluno.nome = sc.next();

    System.out.println("Informe o nome do curso");
    aluno.nomeCurso = sc.next();

    System.out.println("Informe a matrícula");
    aluno.matricula = sc.next();

    for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
      System.out.println("Informe o nome da disciplina " + i);
      aluno.nomeDisciplinas[i] = sc.next();
    }

    for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
      System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
      for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
        System.out.println("Informe a nota " + (j + 1));
        aluno.notasDisciplinas[i][j] = sc.nextDouble();

      }

    }

    aluno.mostrarInfo();

    for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
      if (aluno.verificarAprovado(i)) {
        System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " --> APROVADO");
      } else {
        System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " --> REPROVADO");
      }
    }

  }
}

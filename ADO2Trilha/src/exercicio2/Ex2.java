package exercicio2;

public class Ex2 {

  public static void main(String[] args) {

    Livro livro = new Livro();

    livro.nome = "Harry Potter e as Relíquias da Morte";
    livro.autor = "J.K Rowling";
    livro.numeroPaginas = 512;
    livro.tipoCapa = "Capa dura";
    livro.idioma = "Inglês";
    livro.genero = "Fantasia";
    livro.anoLancamento = 2007;

    System.out.println("Nome do livro = " +livro.nome);
  }
}

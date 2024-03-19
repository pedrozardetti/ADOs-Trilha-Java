package exercicio3;

public class Ex3 {

  public static void main(String[] args) {

    LivroLivraria livro = new LivroLivraria();

    livro.nome = "Harry Potter e as Relíquias da Morte";
    livro.autor = "J.K Rowling";
    livro.numeroPaginas = 512;
    livro.tipoCapa = "Capa dura";
    livro.idioma = "Inglês";
    livro.genero = "Fantasia";
    livro.anoLancamento = 2007;
    livro.preco = 76.92;

    System.out.println("Nome do livro = " + livro.nome);

  }

}

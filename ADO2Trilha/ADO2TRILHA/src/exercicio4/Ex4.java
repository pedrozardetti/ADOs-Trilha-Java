package exercicio4;

import java.util.Date;


public class Ex4 {
  
  public static void main(String[] args) {
    
    LivroDeBiblioteca livro = new LivroDeBiblioteca();
    
    livro.nome = "Harry Potter e as Relíquias da Morte";
    livro.autor = "J.K Rowling";
    livro.numeroPaginas = 512;
    livro.tipoCapa = "Capa dura";
    livro.idioma = "Inglês";
    livro.genero = "Fantasia";
    livro.anoLancamento = 2007;
    livro.preco = 76.92;

    livro.emprestado = true;
    livro.dataEntrega = new Date();
    livro.emprestadoPara = "Pedrin Safado";

    System.out.println("Nome do livro = " + livro.nome);
  }
}

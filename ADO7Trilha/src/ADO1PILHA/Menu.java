package ADO1PILHA;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        SistemaDocumentos sistemaDocumentos = new SistemaDocumentos();
        
        int opcao = 0;

        do {
            System.out.println("\nSeja Bem-Vindo ao Nosso Sistema!");
            System.out.println("1. Adicionar um documento");
            System.out.println("2. Remover um documento");
            System.out.println("3. Listar os documentos");
            System.out.println("4. Tamanho da pilha");
            System.out.println("5. Documento mais antigo");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do documento");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Informe o tipo de documento");
                    String tipo = sc.nextLine();

                    System.out.println("Informe o conteúdo do documento");
                    String conteudo = sc.nextLine();

                    Documento doc = new Documento(nome, tipo, conteudo);
                    sistemaDocumentos.adicionarDocumento(doc);
                    break;
            
                case 2:
                    sistemaDocumentos.removerDocumento();
                    break;

                case 3: 
                    sistemaDocumentos.listarDocumento();
                    break;
                
                case 4: 
                    sistemaDocumentos.tamanhoPilha();
                    break;

                case 5: 
                    sc.nextLine();
                    sistemaDocumentos.documentoMaisAntigo();
            }
        } while (opcao != 0);
        System.out.println("Você saiu do nosso sistema :(");
    }
}

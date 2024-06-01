package ADO7HASH;

import java.util.Scanner;

public class Ui {
    static Scanner ler = new Scanner(System.in);

    public static String pedirCodigo(String message) {
        System.out.println(message);
        return ler.next();
    }

    public static double pedirPreco(String message) {
        System.out.println(message);
        return ler.nextDouble();
    }

}

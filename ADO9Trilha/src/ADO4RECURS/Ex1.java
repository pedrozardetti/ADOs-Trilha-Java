package ADO4RECURS;

import java.util.Scanner;

public class Ex1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tabuada(5, 0);
    }

    public static void tabuada(int numero, int contador) {

        if (contador >= 11) {
            return;
        }

        int resultado = numero * contador;
        System.out.println("A tabuada do 5 é: " + numero + " x " + contador + " = " + resultado);
        contador++;
        tabuada(numero, contador);
    }

}

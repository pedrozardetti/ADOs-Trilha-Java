package ADO1RECURS;
import java.util.Scanner;

public class Ex1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Informe o número");
        int f = fatorial(8);
        System.out.println(f);
    }

    public static int fatorial(int fatorial) {

        if (fatorial == 0) {
            return 1;
        }
        return fatorial * fatorial(--fatorial);

    }
}

package ADO2RECURS;

public class Ex2 {
        public static void main(String[] args) {
            int num = 5;
            int result = soma(num);
            System.out.println("A soma dos " + num + " primeiros números naturais é " + result);
        }
    
        public static int soma(int n) {
            if (n == 1) {
                return 1;
            } else 
                return n + soma(n - 1);
        }
    }
    


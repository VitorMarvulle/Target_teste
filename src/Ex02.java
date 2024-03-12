import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        if (verificarFibonacci(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }

        scan.close();
    }

    public static boolean verificarFibonacci(int num) {
        if (num < 0) {
            return false; // números negativos não pertencem à sequência de Fibonacci
        }

        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) {
                return true; //pertence
            }
            
            int aux = a + b;
            a = b;
            b = aux;
        }

        return false; //não pertence
    }
}
package exercicios;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Não é primo");
            scanner.close();
            return;
        }

        int i = 2;
        boolean primo = true;

        while (i * i <= n) {
            if (n % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

        if (primo) {
            System.out.println(n + " é primo");
        } else {
            System.out.println(n + " não é primo");
        }

        scanner.close();
    }
}
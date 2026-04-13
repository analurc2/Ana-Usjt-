package exercicios;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você deseja ver? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        int count = 0;

        System.out.println("\nSequência:");

        while (count < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }

        System.out.println(); 
        scanner.close();
    }
}
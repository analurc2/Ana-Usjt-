package exercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor inicial (K): ");
        double inicio = scanner.nextDouble();

        System.out.print("Valor final (K): ");
        double fim = scanner.nextDouble();

        System.out.print("Passo: ");
        double passo = scanner.nextDouble();

        double atual = inicio;

        while (atual <= fim) {
            double celsius = atual - 273.15;
            System.out.printf("K: %.2f | C: %.2f\n", atual, celsius);
            atual += passo;
        }
        scanner.close();
    }
}
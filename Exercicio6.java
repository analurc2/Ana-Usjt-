package exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        System.out.println("Digite 10 alturas:");

        while (i < 10) {
            System.out.print("Altura " + (i + 1) + ": ");
            double h = scanner.nextDouble();

            soma += h;

            if (h > maior) maior = h;
            if (h < menor) menor = h;

            i++;
        }

        System.out.println("\nResultados:");
        System.out.println("Média: " + (soma / 10));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
package exercicios;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de termos: ");
        int termos = scanner.nextInt();

        int i = 0;
        double soma = 0;
        int sinal = 1;
        int denominador = 1;

        while (i < termos) {
            soma += sinal * (1.0 / denominador);
            sinal *= -1;
            denominador += 2;
            i++;
        }

        double piAprox = 4 * soma;

        System.out.println("PI aproximado: " + piAprox);
        System.out.println("PI real: " + Math.PI);

        scanner.close(); 
    }
}
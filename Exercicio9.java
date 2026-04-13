package exercicios;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base (b): ");
        double b = scanner.nextDouble();

        System.out.print("Número (n): ");
        double n = scanner.nextDouble();

        int contador = 0;

        while (n > 1) {
            n = n / b;
            contador++;
        }

        System.out.println("Resultado (aprox. log base " + b + "): " + contador);

        scanner.close(); 
    }
}
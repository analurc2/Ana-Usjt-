package exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo inicial da contagem (em segundos): ");
        int n = scanner.nextInt();

        System.out.println("\nIniciando contagem regressiva...\n");

        while (n >= 0) {
            System.out.println("Sistema operando. T-menos " + n + " segundos");
            n--;
        }

        System.out.println("\nLançamento realizado");

        scanner.close();
    }
}
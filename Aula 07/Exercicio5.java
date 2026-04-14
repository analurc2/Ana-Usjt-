package exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = 2026;
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite a senha: ");
            int tentativa = scanner.nextInt();

            if (tentativa == senha) {
                System.out.println("Acesso permitido!");
                scanner.close();
                return;
            }

            tentativas++;
            System.out.println("Senha incorreta!");

            if (tentativas < 3) {
                System.out.println("Tentativas restantes: " + (3 - tentativas));
            }
        }

        System.out.println("Terminal bloqueado!");
        scanner.close();
    }
}
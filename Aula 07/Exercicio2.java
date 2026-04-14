package exercicios;
import java.util.Scanner;
    public class Exercicio2 {
        public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        int i = inicio + 1;

        System.out.println("O número entre eles: ");

        while (i < fim) {
            System.out.println(i);
            i++;
        }
        scanner.close();
        }   
       
}

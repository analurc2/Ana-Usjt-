package exercicios;
import java.util.Scanner;
public class Exercicio3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        int valor;
        int soma = 0;
        int count = 0;

    System.out.println("Digite temperaturas (999 para parar):");
        valor = scanner.nextInt();

        while (valor != 999) {
            soma+=valor;
            count++;
            valor = scanner.nextInt();
        }

        if (count > 0) {
            System.out.println("Média: " + (soma / (double) count)); 
        }
            else {
            System.out.println("Nenhum valor é válido.");
            }
        scanner.close();
    }
    }
    


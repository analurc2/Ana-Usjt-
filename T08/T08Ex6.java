import java.util.Scanner;

public class T08Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;

        // Leitura do vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        // Número X
        System.out.print("Digite o número X: ");
        int x = sc.nextInt();

        // Contagem
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == x) {
                contador++;
            }
        }

        System.out.println("O número apareceu " + contador + " vezes.");

        sc.close();
    }
}

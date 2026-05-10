import java.util.Scanner;

public class T08Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] temp = new int[10];
        int tamanho = 0;

        // Leitura
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        // Verificando números únicos
        for (int i = 0; i < 10; i++) {

            int contador = 0;

            for (int j = 0; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    contador++;
                }
            }

            if (contador == 1) {
                temp[tamanho] = vetor[i];
                tamanho++;
            }
        }

        // Exibição
        System.out.println("Números que não se repetem:");

        for (int i = 0; i < tamanho; i++) {
            System.out.println(temp[i]);
        }

        sc.close();
    }
}
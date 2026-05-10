 import java.util.Scanner;
 public class T08Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[15];

        // Leitura
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        double menor = vetor[0];

        // Verificação
        for (int i = 1; i < 15; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}


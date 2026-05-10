  import java.util.Scanner;
  public class T08Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        // Leitura
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int ultimo = vetor[4];

        // Rotação
        for (int i = 4; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }

        vetor[0] = ultimo;

        // Exibição
        System.out.println("Vetor rotacionado:");

        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}


 import java.util.Scanner;
 public class T08Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        // Leitura vetor A
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        // Leitura vetor B
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        // Multiplicação
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] * B[i];
        }

        // Exibição
        System.out.println("Vetor C:");

        for (int i = 0; i < 5; i++) {
            System.out.println(C[i]);
        }

        sc.close();
    }
}


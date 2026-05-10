import java.util.Scanner;
public class T08Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        // Leitura A
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        // Leitura B
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        // Intercalando
        for (int i = 0; i < 10; i++) {
            C[i * 2] = A[i];
            C[i * 2 + 1] = B[i];
        }

        // Exibição
        System.out.println("Vetor C:");

        for (int i = 0; i < 20; i++) {
            System.out.println(C[i]);
        }

        sc.close();
    }
}


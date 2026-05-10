import java.util.Scanner;

public class T08Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        // Exibição dos valores positivos
        System.out.println("Valores positivos:");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
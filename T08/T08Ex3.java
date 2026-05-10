import java.util.Scanner;

public class T08Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double soma = 0;

        // Leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        // Resultado
        System.out.println("Soma dos elementos: " + soma);

        sc.close();
    }
}
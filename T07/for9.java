import java.util.Scanner;
public class for9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int p;
        double resultado = 1;
        System.out.print("Digite um numero: ");
            n = sc.nextInt();
            System.out.print("Digite o quanto quer elevar o numero: ");
            p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            resultado = resultado * n;
        }
        System.out.println("O resultado é: " + resultado);

        sc.close();
    }
}

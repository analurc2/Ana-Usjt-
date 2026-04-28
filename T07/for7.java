import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int soma = 0;
            double media;

            for (int c = 1; c <= 5; c++) {
                System.out.println("Digite o valor da peça " + c + ":");
                int d = sc.nextInt();

                if (d > 0) {
                    soma += d;
                } else {
                    System.out.println("Valor inválido, digite um valor positivo");
                    c--;
                }
            }

            media = soma / 5.0;
            System.out.println("Média: " + media);

            System.out.println("Quer repetir o programa? (s/n)");
            

        } while (sc.next().equalsIgnoreCase("s"));

        sc.close();
    }
}
import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        do {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    num = num / i;
                    break;
                }
            }
        } while (num > 1);

        sc.close();
    }
}
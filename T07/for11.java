import java.util.Scanner;

public class for11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 1234;

        for(int tentativa = 1; tentativa <= 3; tentativa++) {

            int senha;

            do {
                System.out.print("Digite uma senha de 4 dígitos: ");
                senha = sc.nextInt();
            } while (senha < 1000 || senha > 9999);

            if (senha == senhaCorreta) {
                System.out.println("Acesso liberado!");
                break;
            } else {
                System.out.println("Senha incorreta!");
            }
        }

        sc.close();
    }
}
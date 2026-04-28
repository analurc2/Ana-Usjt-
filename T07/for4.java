import java.util.Scanner;
public class for4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite um número inteiro: ");
            int d = sc.nextInt();
            int i;
            int soma = 0;
                for  (i = 1; i <= d; i++){
                    if (d % i == 0){
                     soma = soma + i;
                    }
                }
            System.out.println("Soma dos numeros pares: " + soma);

            System.out.println("quer repetir o programa? (s/n)");
        }
        while (sc.next().equalsIgnoreCase("s"));

        sc.close();
    }
}
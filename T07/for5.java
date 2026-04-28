import java.util.Scanner;
public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
            for  (i = 1; i <= 10; i++){

                System.out.println("Digite um número inteiro: ");
                int d = sc.nextInt();
                if (d >= 10 && d <= 20){
                    System.out.println("Esse numero está entre 10 e 20");
                }
                else {
                    System.out.println("Esse numero não está entre 10 e 20");
                }
            }
        
        sc.close();
    }
}
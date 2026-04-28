import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {     
            for (int j = 0; j < n; j++)  {  
                System.out.print("* \t");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;

        
        do {
            System.out.print("Digite a primeira nota (0 a 10): ");
            nota1 = sc.nextDouble();
                if(nota1 < 0){
                    System.out.println("Nota Inválida");
                }
                if(nota1 > 10){
                    System.out.println("Nota Inválida");
                } 
            
        } while (nota1 < 0 || nota1 > 10);

        
        do {
            System.out.print("Digite a segunda nota (0 a 10): ");
            nota2 = sc.nextDouble();
            if(nota2 < 0){
                System.out.println("Nota Inválida");
            }
            if(nota2 > 10){
                System.out.println("Nota Inválida");
            }
        } while (nota2 < 0 || nota2 > 10);
        
        System.out.print("Processando");
        for (int i = 1; i <= 5; i++) {
            System.out.print(".");
        }

        double media = (nota1 + nota2) / 2;

        System.out.println("\nMédia: " + media);

        sc.close();
    }
}

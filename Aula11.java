import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total ");
        int valor = scanner.nextInt();
        
        int resto1;
        int resto2;
        int resto3;
        int resto4;
        int resto5;
        int resto6;

        int n100 = valor / 100;
        resto1 = valor % 100;

        int n50 = resto1 / 50;
        resto2 = resto1 % 50;

        int n20 = resto2 / 20;
        resto3 = resto2 % 20;

        int n10 = resto3 / 10;
        resto4 = resto3 % 10;

        int n5 = resto4 / 5;
        resto5 = resto4 % 5;

        int n2 = resto5 / 2;
        resto6 = resto5 % 2;

        int n1 = resto6;

        System.out.println("Notas necessárias:");
        System.out.println("100: " + n100);
        System.out.println("50: " + n50);
        System.out.println("20: " + n20);
        System.out.println("10: " + n10);
        System.out.println("5: " + n5);
        System.out.println("2: " + n2);
        System.out.println("1: " + n1);

        scanner.close();
    } 
}

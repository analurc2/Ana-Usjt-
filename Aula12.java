import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.print(" Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.print(" Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.print(" Digite o terceiro numero: ");
        double num3 = scanner.nextDouble();

        if( num1 > num2 && num2 > num3)
            System.out.print("A ordem certa é: " + num1 + " > " + num2 + " > " + num3);
        else if( num3 > num2 && num2 > num1)
             System.out.print("A ordem certa é: " + num3 + " > " + num2 + " > " + num1);
        else if( num1 > num3 && num3 > num2)
            System.out.print("A ordem certa é: " + num1 + " > " + num3 + " > " + num2);
        else if( num3 > num1 && num1 > num2)
            System.out.print("A ordem certa é: " + num3 + " > " + num1 + " > " + num2);
        else if( num2 > num1 && num1 > num3)
            System.out.print("A ordem certa é: " + num2 + " > " + num1 + " > " + num3);
        else 
            System.out.print("A ordem certa é: " + num2 + " > " + num3 + " > " + num1);

    
        scanner.close();
    }
}

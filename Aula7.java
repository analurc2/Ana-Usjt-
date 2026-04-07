import java.util.Scanner;

public class Aula7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc <= 18.5)
        {System.out.println("Abaixo do peso");}
        else if (imc > 18.5 && imc <= 24.9)
            {System.out.println("Peso normal");}
        else if (imc > 25 && imc <= 29.9)
            {System.out.println("Sobre peso");}
        else if (imc > 30 && imc <= 34.9)
            {System.out.println("Obesidade Grau I");}
        else if (imc > 35 && imc <= 39.9)
            {System.out.println("Obesidade Grau II");}
        else
            {System.out.println("Obesidade Grau III");}
        scanner.close();
     }     
}

import java.util.Scanner;
public class Aula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        double numero = scanner.nextDouble();
        if ( numero > 0)
        { System.out.println(numero + " é positivo"); }
        else if ( numero < 0)
        { System.out.println(numero + " é negativo"); }
        else
        { System.out.println("Seu numero é zero"); }
        scanner.close();
    }
}

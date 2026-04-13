package exercicios;
import java.util.Scanner;
public class Exercicio1 {
public static void main (String [] args) {
Scanner scanner = new Scanner (System.in);

    System.out.print("Digite um número: ");
    int n = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        int resultado = n * i;
        if (resultado % 3 == 0) {
    System.out.println(n + " x " + i + " = " + resultado);
 }
 scanner.close();
}

}
}

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String op = scanner.next();

        double resultado;

        // Estrutura de decisão
        switch(op) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}

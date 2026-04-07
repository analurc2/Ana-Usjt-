import java.util.Scanner;
public class Aula9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double temp = scanner.nextDouble();

        double resultado;
        System.out.print("Escolha (1: ºC para ºF | 2: ºF para ºC): ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1 :
                resultado = temp / 1.8 + 32;
                System.out.println("Resultado: " + resultado);
                break;

            case 2 :
            resultado = ( temp - 32) / 1.8;
            System.out.println("Resultado: " + resultado);
            break;
        }
       scanner.close();
}
}
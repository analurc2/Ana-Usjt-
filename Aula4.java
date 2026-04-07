import java.util.Scanner;
public class Aula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        double preco = scanner.nextDouble();
        if ( preco <= 50)
        { System.out.println(" É barato"); }
        else if ( preco > 50 && preco <= 100)
        { System.out.println("Ta na media"); }
        else
        { System.out.println("Ta caro"); }
        scanner.close();
    }
}

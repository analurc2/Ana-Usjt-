import java.util.Scanner;
public class Aula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano que voce nasceu");
        double ano = scanner.nextDouble();
        if ( ano > 2000 && ano <= 2100)
        { System.out.println("Voce nasceu no seculo XXI"); }
        else if ( ano <= 2000 && ano > 1901)
        { System.out.println("Voce nasceu no seculo XX"); }
        else
        { System.out.println("Voce nao nasceu nem no seculo XX e nem no XXI"); }
        scanner.close();
    }
}

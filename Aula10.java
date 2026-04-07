import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = scanner.nextDouble();
        System.out.println("Digite o valor de y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0)
            { System.out.println("Quadrante 1"); }
        else if (x > 0 && y < 0)
            { System.out.println("Quadrante 4"); }
        else if (x < 0 && y > 0)
            { System.out.println("Quadrante 2"); }
        else if (x < 0 && y < 0)
            { System.out.println("Quadrante 3"); }
        else 
            { System.out.println("Algum dos valores é 0"); }






        scanner.close();
    }
    
}

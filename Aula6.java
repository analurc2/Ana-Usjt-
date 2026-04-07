import java.util.Scanner;
public class Aula6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do atleta");
        double idade = scanner.nextDouble();
        if ( idade >=18)
        { System.out.println("Sênior"); }
        else if ( idade <= 17 && idade >= 11)
        { System.out.println("Ta na media"); }
        else if (idade <= 10 && idade >= 5)
        { System.out.println("infantil"); }
        else
        { System.out.println("nao entra"); }  
        scanner.close();
    }
}

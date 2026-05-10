import java.util.Scanner;

public class T08Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] materiais = new String[5];

        // Leitura dos materiais
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um material: ");
            materiais[i] = sc.nextLine();
        }

        // Exibição
        System.out.println("Materiais digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(materiais[i]);
        }

        sc.close();
    }
}
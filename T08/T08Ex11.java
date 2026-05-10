    import java.util.Scanner;
    public class T08Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double[] pesos = new double[5];

        double somaNotas = 0;
        double somaPesos = 0;

        // Leitura
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();

            System.out.print("Peso: ");
            pesos[i] = sc.nextDouble();

            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double media = somaNotas / somaPesos;

        System.out.println("Média ponderada: " + media);

        sc.close();
    }
}


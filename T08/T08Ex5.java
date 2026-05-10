import java.util.Scanner;
    public class T08Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;
        int acimaMedia = 0;

        // Leitura das notas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;

        // Verificando acima da média
        for (int i = 0; i < 10; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);

        sc.close();
    }
}


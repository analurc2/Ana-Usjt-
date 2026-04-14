package exercicios;
public class Exercicio10 {
    public static void main(String[] args) {

        double valor = 500000.0;
        double manutencao = 15000.0;
        double custoAcumulado = 0.0;

        int anos = 0;

        while (custoAcumulado <= valor) {
            anos++;

            custoAcumulado += manutencao;
            valor *= 0.88; // deprecia 12%
            manutencao += 5000;

            System.out.println("Ano " + anos +
                    " | Valor: R$ " + valor +
                    " | Manutenção acumulada: R$ " + custoAcumulado);
        }

        System.out.println("\nRESULTADO FINAL:");
        System.out.println("Anos necessários: " + anos);
        System.out.printf("Custo acumulado: R$ %.2f\n", custoAcumulado);
        System.out.printf("Valor final da máquina: R$ %.2f\n", valor);
    }
}
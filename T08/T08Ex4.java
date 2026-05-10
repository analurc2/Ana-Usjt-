public class T08Ex4 {

    public static void main(String[] args) {

        int[] vetor = new int[20];

        // Preenchendo o vetor
        for (int i = 0; i < 20; i++) {
            vetor[i] = i * i;
        }

        // Exibindo
        for (int i = 0; i < 20; i++) {
            System.out.println("v[" + i + "] = " + vetor[i]);
        }
       
    }
  
}


public class for10 {
    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                int S = (x * x) + (y * y);
                System.out.print(S + "\t");
            }
            System.out.println();
        }

    }
}

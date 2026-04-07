import java.util.Scanner;
public class Aula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scanner.next().toLowerCase();
    
        switch(letra)
        {
            case "a": 
            case "e": 
            case "i": 
            case "o": 
            case "u": 
            System.out.println("É uma vogal");
            break;
            default: System.out.println("É uma consoante");
            break;
           
             
        }
        scanner.close();
    }
}
package firsttwomonths.training;

import java.util.Scanner;

public class helloworld {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua diade:");
        int idade = scanner.nextInt();

        System.out.println("Minha idade é: " + idade);

        
    }
}

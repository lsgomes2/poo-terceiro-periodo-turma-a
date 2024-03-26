package BIM1;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sua idade é?");
        int idade = scanner.nextInt();

        System.out.println("Minha idade é " +idade);
    }
}

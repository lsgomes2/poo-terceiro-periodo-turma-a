package primeirobi;

import java.util.Scanner;

public class HelloWorld {
    /**
     * @param args
     */
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("informe sua idade: ");
       int idade = scanner.nextInt();

       System.out.println("minha idade é: " + idade);
    } 
}

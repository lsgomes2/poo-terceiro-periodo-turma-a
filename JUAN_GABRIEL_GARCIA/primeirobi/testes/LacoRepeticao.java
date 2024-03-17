package primeirobi.testes;

import java.util.Scanner;

public class LacoRepeticao {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorx = new int[3];


        for (int i = 0; i < 3; i++) {

            System.out.println("\n Coloque um valor para a posição " + i + " do vetor");
            vetorx[i] = scan.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("\n \s" + i + " " + vetorx[i]);
        }
    }
}
package primeirobi.exemplos;

public class testematriz {
    public static void main(String[] args) {
        
        int[][] matriz1 = {
            {31, 27, 4},
            {44, 32, 95},
            {9, 16, 56}
        };

        int[][] matriz2 = {
            {10, 88, 12},
            {38, 32, 73},
            {14, 21, 52}
        };

        
        System.out.println("Elemento de valor 95 da matriz 1: " + matriz1[1][2]);
        System.out.println("Elemento de valor 14 da matriz 2: " + matriz2[2][0]);

       
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

      
        System.out.println("Matriz 3 (soma de matriz1 e matriz2):");
        for (int[] linha : matriz3) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

       
        int[][] matriz2Multiplicada = new int[3][3];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2Multiplicada[i][j] = matriz2[i][j] * 4;
            }
        }

      
        System.out.println("Matriz 2 multiplicada por 4:");
        for (int[] linha : matriz2Multiplicada) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

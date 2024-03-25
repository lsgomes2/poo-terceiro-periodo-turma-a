package primeirobi.testes;

public class exemplos {
    
    public static void main(String[] args) {
        int[][] mat1 = new int[][] {{31,27,4},{44,32,95},{9,16,56}};
        int[][] mat2 = new int[][] {{10,88,12},{38,32,73},{14,21,52}};
        int[][] mat3 = new int [3][3];
        int[][] mat4 = new int [3][3];

        System.out.println("\nPrintar valores 95 e 14");
        System.out.println(mat1[2][1]);
        System.out.println(mat2[0][2]);
        System.out.print("\n");


        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("\nPrintar matrizes 1 e 2 somadas");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat4[i][j] = mat2[i][j] * 4;
            }
        }
        System.out.println("\nPrintar matriz 2 multiplicada por 4");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print(mat4[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

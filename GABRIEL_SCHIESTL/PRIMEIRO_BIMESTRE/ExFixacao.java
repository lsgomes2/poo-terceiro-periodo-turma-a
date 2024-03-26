package PRIMEIRO_BIMESTRE;

public class ExFixacao {
    public static void main(String[] args){
    int[][] mat1 = {{31, 27, 4}, {44, 32, 95}, {9, 16, 56}};
    int[][] mat2 = {{10, 88, 12}, {38, 32, 73}, {14, 21, 52}};
    int[][] mat3 = new int[3][3];
    int[][] mat4 = new int[3][3];
    System.out.println(mat1[1][2]);
    System.out.println(mat2[2][0]);
    for (int i = 0; i < mat3.length; i++) {
        for (int j = 0; j < mat3.length; j++) {
            mat3[i][j] = mat1[i][j] + mat2[i][j];
            System.out.print(mat3[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
    for (int i = 0; i < mat4.length; i++) {
        for (int j = 0; j < mat4.length; j++) {
            mat4[i][j] = mat2[i][j] * 4;
            System.out.print(mat4[i][j] + " ");
        }
        System.out.println();
    }
    }
}

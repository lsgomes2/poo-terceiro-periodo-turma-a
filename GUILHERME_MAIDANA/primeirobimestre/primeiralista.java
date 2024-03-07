package primeirobimestre;
import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0, z = 0, total = 0, menu = 0;

        System.out.println("Digite a quantidade de compras que você comprou:");
        x = scanner.nextInt();
        System.out.println("Digite o preço do produto:");
        y = scanner.nextInt();
        total = y * x;
        System.out.println("Digite o valor recebido do cliente:");
        z = scanner.nextInt();

        System.out.println("Entre com uma opção. 1 para calcular o total da compra, 2 para calcular seu troco, 3 para sair");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("O total da sua compra é: " + total);
                break;
            case 2:
                System.out.println("O troco é: " + (z - total));
                break;
            case 3:
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
}

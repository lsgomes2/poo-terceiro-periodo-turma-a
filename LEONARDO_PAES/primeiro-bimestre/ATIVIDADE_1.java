import java.util.Scanner;

public class ATIVIDADE_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float preco, quant;
        int menu = 0; 

        while (menu != 3) {
            System.out.println("\nMenu");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            menu = sc.nextInt();

            switch (menu) {
                case 1:

                    System.out.println("\nDigite a quantidade de Plantas:");
                    quant = sc.nextFloat();

                    System.out.println("\nDigite o Preço do Produto: R$");
                    preco = sc.nextFloat();

                    System.out.print("\nO Preço total é = R$" + (preco * quant));
                    break;

                case 2:

                    System.out.println("\nDigite o valor total dos produtos: R$");
                    float total = sc.nextFloat();

                    System.out.println("\nDigite o valor pago: R$");
                    float pago = sc.nextFloat();

                    System.out.print("\n O valor do troco é: R$" + (pago - total));
                    break;

                case 3:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }

        sc.close();
    }
}

package primeirobimestre;

import java.util.Scanner;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do 
        {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Obrigado por usar a calculadora!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    private static void exibirMenu() 
    {
        System.out.print("1 - Calcular preço total \n");
        System.out.print("2 - Calcular troco \n");
        System.out.print("3 - Sair \n");
        System.out.print("Digite a opção desejada: ");
    }

    private static void calcularPrecoTotal(Scanner scanner) 
    {
        System.out.print("Digite a quantidade do item: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço do item: ");
        int precoUnitario = scanner.nextInt();

        int precoTotal = quantidade * precoUnitario;

        System.out.printf("O preço total é: %d\n", precoTotal);
    }

    private static void calcularTroco(Scanner scanner) 
    {
        System.out.print("Digite o valor total da compra: ");
        int valorTotal = scanner.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        int valorPago = scanner.nextInt();

        int troco = valorPago - valorTotal;

        System.out.printf("O troco é: R$ %d\n", troco);
    }
}

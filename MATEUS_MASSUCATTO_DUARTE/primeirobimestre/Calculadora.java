package primeirobimestre;

import java.util.Scanner;

public class Calculadora 
{
    private static int[][] quantidadeVendasDiaEMes = new int [12][31];
    private static double[][] precoTotalDiaEMes = new double[12][31];
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
                case 4:
                    buscarVendasPorDiaEMes(scanner);
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
        System.out.println("4 - Buscar histórico de vendas \n");
        System.out.print("Digite a opção desejada: ");
    }

    private static void calcularPrecoTotal(Scanner scanner) 
    {
        System.out.print("Digite a quantidade do item: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço do item: ");
        int precoUnitario = scanner.nextInt();
        double precoTotal = quantidade * precoUnitario;
        System.out.printf("O preço total é: %.2f\n", precoTotal);
        if (quantidade >= 10) {
            precoTotal = precoTotal - (precoTotal * 0.05);
            System.out.printf("o preço total com desconto é: %.2f\n", precoTotal);
        }

        int mes, dia;
        do {
            System.out.println("Digite o número do mês(1 a 12): ");
            mes = scanner.nextInt();
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Digite o número do dia (1 a 31): ");
            dia = scanner.nextInt();
        } while (dia < 1 || dia > 31); 

        quantidadeVendasDiaEMes[mes - 1][dia - 1] += quantidade;
        precoTotalDiaEMes[mes - 1][dia - 1] +=  precoTotal;
            
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

    private static void buscarVendasPorDiaEMes(Scanner scanner)
    {
        System.out.println("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();
        System.out.println("Digite o número do dia(1 a 31): ");
        int dia = scanner.nextInt();

        int quantidade = quantidadeVendasDiaEMes[mes - 1][dia - 1];
        double precoTotal = precoTotalDiaEMes[mes - 1][dia - 1];

        System.out.println("Quantidade de vendas: " + quantidade);
        System.out.println("Preço total das vendas: " + precoTotal);
    }
}

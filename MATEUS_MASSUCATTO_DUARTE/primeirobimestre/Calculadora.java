package primeirobimestre;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculadora 
{
    private static ArrayList<Integer> listaQuantidade = new ArrayList<>();
    private static ArrayList<Double> listaPreco = new ArrayList<>();
    private static ArrayList<Integer> listaDesconto = new ArrayList<>();
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
                    System.out.println("Histórico de vendas: \n");
                    for (int i = 0; i < listaQuantidade.size(); i++)
                    {
                        System.out.println("\n Quantidade: " + listaQuantidade.get(i) + "\n Preço: " + listaPreco.get(i) + "\n Desconto: " + listaDesconto.get(i) + "%");
                    } 
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
        System.out.println("4 - Ver histórico de vendas \n");
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
        
        listaQuantidade.add(quantidade);
        listaPreco.add(precoTotal);
        listaDesconto.add(quantidade >=10 ? 5 : 0);
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

package primeirobimestre;
import java.util.Scanner;

public class at2 {

    static int totalPlantasVendidas = 0;
    static double totalValorVenda = 0;
    static double totalDescontoAplicado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar a calculadora de vendas!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (escolha != 3);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n*** Menu da Calculadora de Vendas ***");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        System.out.print("Escolha a opção desejada: ");
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = scanner.nextInt();
        totalPlantasVendidas += quantidade;

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        if (quantidade > 10) {
            double desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            totalDescontoAplicado += desconto;
        }
        totalValorVenda += precoTotal;

        System.out.println("O preço total da venda é: R$" + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor recebido pelo cliente: R$");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Digite o valor total da compra: R$");
        double valorTotalCompra = scanner.nextDouble();

        double troco = valorRecebido - valorTotalCompra;
        System.out.println("O troco a ser dado ao cliente é: R$" + troco);
    }
}



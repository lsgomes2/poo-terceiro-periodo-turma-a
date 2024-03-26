package primeirobi;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean opcao = false;
            int x;
            boolean sair = false;
            int escolha;

            do {
                System.out.println("\nMenu:\n");
                System.out.println("1 Calcular Preço");
                System.out.println("2 Calcular Troco");
                System.out.println("3 Registro de Vendas");
                System.out.println("4 Sair");
                System.out.println("\nOpções do Menu:\n");
                System.out.println("1 - Calcular Preço");
                System.out.println("2 - Calcular Troco");
                System.out.println("3 - Registrar Venda");
                System.out.println("4 - Encerrar");
                System.out.print("Escolha uma opção: ");
                x = scanner.nextInt();

                switch (x) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        escolha = x;
                        break;
                    default:
                        escolha = -1;
                        System.out.println("Opção inválida. Tente novamente.");
                }

                switch (escolha) {
                    case 1:
                        calcularPreco();
                        break;
                    case 2:
                        calcularTroco();
                        break;
                    case 3:
                        registrarVenda();
                        break;
                    case 4:
                        opcao = true;
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (!opcao);
        }
    }

    public static void calcularPreco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        double precoTot = quantidade * preco;
        if (quantidade > 10)
            precoTot *= 0.95;
        System.out.println("O preço total é: R$ " + precoTot);
    }

    public static void calcularTroco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valRecebido = scanner.nextDouble();
        System.out.print("Digite o valor total da compra: ");
        double valTotal = scanner.nextDouble();
        double troco = valRecebido - valTotal;
        if (troco < 0) {
            System.out.println("Valor recebido insuficiente.");
        } else {
            System.out.println("O troco a ser dado ao cliente é: R$ " + troco);
        }
    }

    public static void registrarVenda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos vendidos: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o valor da venda: ");
        double valorVenda = scanner.nextDouble();
        double valorTotal = quantidade * valorVenda;
        if (quantidade > 10)
            valorTotal *= 0.95;
        System.out.println("Venda registrada: " + quantidade + " produtos vendidos por R$ " + valorTotal);
    }
}

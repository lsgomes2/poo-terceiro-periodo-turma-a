package primeirobi.list1;

import java.util.Scanner;

public class Lista1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("\nEscolha uma opçao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("\nPrograma finalizado");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        } while (opcao != 3);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n[1] - Calcular preço total");
        System.out.println("[2] - Calcular troco");
        System.out.println("[3] - Sair");
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("\nQuantidade da planta: ");
        int quantidade = scanner.nextInt();
        System.out.print("Preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();
        double precoTotal = quantidade * precoUnitario;
        System.out.println("Preço total: R$ " + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("\nValor recebido: ");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Valor total da compra: ");
        double valorTotalCompra = scanner.nextDouble();
        double troco = valorRecebido - valorTotalCompra;
        System.out.println("Troco: R$ " + troco);
    }
}
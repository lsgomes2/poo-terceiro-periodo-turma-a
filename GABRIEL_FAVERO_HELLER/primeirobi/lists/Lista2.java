package primeirobi.lists;

import java.util.Scanner;

public class Lista2 {

    public static int tamanho = 100;
    public static int contador = 0;
    public static int quantidadeRegistro[] = new int[tamanho];
    public static double precoRegistro[] = new double[tamanho];
    public static double descontoRegistro[] = new double[tamanho];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    registroVendas();
                    break;
                case 4:
                    System.out.println("\nPrograma finalizado");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        } while (opcao != 4);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n[1] - Calcular preço total");
        System.out.println("[2] - Calcular troco");
        System.out.println("[3] - Registro de vendas");
        System.out.println("[4] - Sair");
        System.out.print("\nEscolha uma opçao: ");
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("\nQuantidade da planta: ");
        quantidadeRegistro[contador] = scanner.nextInt();
        System.out.print("Preço unitário da planta: ");
        precoRegistro[contador] = scanner.nextDouble();
        double precoTotal = quantidadeRegistro[contador] * precoRegistro[contador];
        double desconto = 0;
        if (quantidadeRegistro[contador] < 10) {
            System.out.println("Preço total: R$ " + precoTotal);
        } else {
            desconto = precoTotal * 0.95;
            System.out.println("Preço total com desconto: R$ " + desconto);
        }
        descontoRegistro[contador] = desconto;
        contador++;
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("\nValor recebido: ");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Valor total da compra: ");
        double valorTotalCompra = scanner.nextDouble();
        double troco = valorRecebido - valorTotalCompra;
        System.out.println("Troco: R$ " + troco);
    }

    private static void registroVendas() {
        for (int i = 0; i < contador; i++) {
            System.out.println("\nRegistro: " + i);
            System.out.println("Quantidade da planta: " + quantidadeRegistro[i]);
            System.out.println("Preço unitário da planta: " + precoRegistro[i]);
            System.out.println("Preço total: R$ " + precoRegistro[i] * quantidadeRegistro[i]);
            System.out.println("Preço total com desconto: R$ " + descontoRegistro[i]);
        }
    }
}
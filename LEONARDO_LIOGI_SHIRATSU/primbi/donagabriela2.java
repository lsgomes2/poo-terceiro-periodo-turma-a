package primbi;

import java.util.Scanner;

public class donagabriela2 {
    private static final int MAX_VENDAS = 100; // Tamanho máximo do vetor de vendas
    private static int numVendas = 0; // Número atual de vendas realizadas
    private static int[] quantidades = new int[MAX_VENDAS]; // Vetor para armazenar as quantidades
    private static double[] precos = new double[MAX_VENDAS]; // Vetor para armazenar os preços
    private static double[] descontos = new double[MAX_VENDAS]; // Vetor para armazenar os descontos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c;

        do {
            System.out.println("Escolha :");
            System.out.println("1 - Calculadora total e Desconto (se aplicável)");
            System.out.println("2 - Calculadora troco");
            System.out.println("3 - Mostrar Vendas");
            System.out.println("4 - Sair");

            c = scanner.nextInt();

            switch (c) {
                case 1:
                    calcularTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    mostrarVendas();
                    break;
                case 4:
                    System.out.println("Desligando");
                    break;
                default:
                    System.out.println("Comando errado!");
            }
        } while (c != 4);

        scanner.close();
    }

    private static void calcularTotal(Scanner scanner) {
        System.out.println("Quantidade da planta: ");
        quantidades[numVendas] = scanner.nextInt();

        System.out.println("Preço da planta: ");
        precos[numVendas] = scanner.nextDouble();

        double total = quantidades[numVendas] * precos[numVendas];
        System.out.println("Preço total: " + total);

        if (quantidades[numVendas] > 10) {
            descontos[numVendas] = total * 0.05;
            total -= descontos[numVendas];
            System.out.println("Desconto aplicado: " + descontos[numVendas]);
        }

        System.out.println("Preço total com desconto (se aplicável): " + total);
        numVendas++;
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.println("Valor total da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Valor recebido: ");
        double valorRecebido = scanner.nextDouble();

        double troco = valorRecebido - valorCompra;

        if (troco >= 0) {
            System.out.println("Troco: " + troco);
        } else {
            System.out.println("Valor recebido insuficiente ");
        }
    }

    private static void mostrarVendas() {
        if (numVendas == 0) {
            System.out.println("Nenhuma venda registrada ainda.");
        } else {
            System.out.println("Lista de Vendas:");
            for (int i = 0; i < numVendas; i++) {
                System.out.println("Venda " + (i + 1) + ": Quantidade: " + quantidades[i] +
                        ", Preço: " + precos[i] + ", Desconto: " + descontos[i]);
            }
        }
    }
}

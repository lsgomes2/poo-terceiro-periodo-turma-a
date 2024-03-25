package primeirobimestre;

import java.util.Scanner;

public class Calculadora {
    private static double descontoEspecial = 0.05; 
    private static int[] quantidades = new int[100]; 
    private static double[] valores = new double[100];
    private static double[] descontos = new double[100]; 
    private static int totalVendas = 0;

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
                    registrarVenda(scanner);
                    break;
                case 3:
                    calcularTroco(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Registrar Venda");
        System.out.println("[3] - Calcular Troco");
        System.out.println("[4] - Sair");
    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.println("Digite a quantidade da planta:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preço unitário da planta:");
        double precoUnitario = scanner.nextDouble();

        double precoTotal;
        if (quantidade > 10) {
            precoTotal = quantidade * precoUnitario * (1 - descontoEspecial);
            System.out.println("Preço total com desconto especial: R$" + precoTotal);
        } else {
            precoTotal = quantidade * precoUnitario;
            System.out.println("Preço total: R$" + precoTotal);
        }
    }

    public static void registrarVenda(Scanner scanner) {
        System.out.println("Digite a quantidade de plantas vendidas:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o valor total da venda:");
        double valorVenda = scanner.nextDouble();

        double desconto = 0.0; 

        if (quantidade > 10) {
            desconto = valorVenda * descontoEspecial;
        }

        quantidades[totalVendas] = quantidade;
        valores[totalVendas] = valorVenda;
        descontos[totalVendas] = desconto;

        totalVendas++;

        System.out.println("Venda registrada: " + quantidade + " Plantas vendidas por: R$" + valorVenda + " Descontos: R$" + desconto);
    }

    public static void calcularTroco(Scanner scanner) {
        System.out.println("Digite o valor recebido pelo cliente:");
        double valorRecebido = scanner.nextDouble();
        System.out.println("Digite o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        double troco = valorRecebido - valorTotal;
        System.out.println("Troco a ser dado ao cliente: R$" + troco);
    }

    public static void exibirRegistroDeVendas() {
        System.out.println("Registro de Vendas:");
        for (int i = 0; i < totalVendas; i++) {
            System.out.println("Quantidade: " + quantidades[i] + ", Valor: R$" + valores[i] + ", Desconto: " + descontos[i]);
        }
    }
}

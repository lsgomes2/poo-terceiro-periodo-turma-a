package primeirobimestre;

import java.util.Scanner;

public class DonaGabrielinha {
    private static double descontoEspecial = 0.05;
    private static double[][] vendasPorDiaEMes = new double[12][30]; 

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
                    exibirRegistroDeVendas();
                    break;
                case 5:
                    buscarVendasPorDiaEMes(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Registrar Venda");
        System.out.println("[3] - Calcular Troco");
        System.out.println("[4] - Exibir Registro de Vendas");
        System.out.println("[5] - Buscar Vendas por Dia e Mês");
        System.out.println("[6] - Sair");
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
        System.out.println("Digite o número do mês (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Digite o número do dia (1-30):");
        int dia = scanner.nextInt();
        System.out.println("Digite o valor total da venda:");
        double valorVenda = scanner.nextDouble();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            vendasPorDiaEMes[mes - 1][dia - 1] += valorVenda;
            System.out.println("Venda registrada para o dia " + dia + " do mês " + mes + ".");
        } else {
            System.out.println("Data inválida!");
        }
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
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                double vendasDiaEMes = vendasPorDiaEMes[mes][dia];
                if (vendasDiaEMes > 0) {
                    System.out.println("Mês " + (mes + 1) + ", Dia " + (dia + 1) + ": R$" + vendasDiaEMes);
                }
            }
        }
    }

    public static void buscarVendasPorDiaEMes(Scanner scanner) {
        System.out.println("Digite o número do mês (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Digite o número do dia (1-30):");
        int dia = scanner.nextInt();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            double vendasDiaEMes = vendasPorDiaEMes[mes - 1][dia - 1];
            System.out.println("Vendas para o dia " + dia + " do mês " + mes + ": R$" + vendasDiaEMes);
        } else {
            System.out.println("Data inválida!");
        }
    }
}

package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.ATIVIDADES;

import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("INFORME A QUANTIDADE DE CLIENTES: ");
        int numberClients = scanner.nextInt();

        int day = 1;
        int month = 1;
        double totalCost = 0.0;
        double[][] salesByMonthDay = new double[12][30];

        for (int i = 0; i < numberClients; i++) {

            System.out.print("\nINFORME O NUMERO DO MÊS EM QUE DESEJA SALVAR OS DADOS DA COMPRA DO CLIENTE " +(i + 1)+ " (1 - 12): ");
            month = scanner.nextInt();
            System.out.print("INFORME O DIA DO MÊS EM QUE DESEJA SALVAR OS DADOS DA COMPRA DO CLIENTE " +(i + 1)+ "(1 - 30): ");
            day = scanner.nextInt();

            System.out.println("\n=======================================================");
            System.out.print("INFORME A QUANTIDADE DE PLANTAS QUE O CLIENTE " + (i + 1) + " IRA COMPRAR: ");
            int quantityPlant = scanner.nextInt();

            System.out.println("=======================================================");
            System.out.print("INFORME O VALOR (INDIVIDUAL) DAS PLANTAS DO CLIENTE " + (i + 1) + ": ");
            double costPlant = scanner.nextDouble();

            System.out.println("=======================================================");
            System.out.print("INFORME O VALOR QUE O CLIENTE " + (i + 1) + " PAGOU: ");
            double payment = scanner.nextDouble();

            System.out.println("=======================================================");
            System.out.println("ESCOLHA A OPERAÇÃO DESEJADA");
            System.out.println(
                    "[1]-CALCULAR O PREÇO\n[2]-CALCULO DO TROCO\n[3]-MOSTRAR HISTORICO DE COMPRAS\n[4]-HISTORICO MENSAL E/OU ANUAL\n[5]-SAIR\n");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Preço total da conta

                    totalCost = quantityPlant * costPlant;
                    if (quantityPlant >= 10) {
                        System.out.println("=======================================================");
                        System.out.println("A COMPRA DO CLIENTE " + (i + 1) + " TERA DESCONTO");
                        double discountCost = totalCost * 0.95;
                        System.out.println("=======================================================");
                        System.out.println(
                                "O PREÇO DA COMPRA (COM DESCONTO) DO CLIENTE " + (i + 1) + " FOI: R$ " + discountCost);

                    } else {
                        System.out.println("=======================================================");
                        System.out.println("O PREÇO TOTAL DA COMPRA (SEM DESCONTO) DO CLIENTE " + (i + 1) + " FOI: R$ "
                                + totalCost);
                    }
                    break;

                case 2:
                    // Troco do cliente

                    double debt = payment - (quantityPlant * costPlant);
                    if (debt < 0) {
                        System.out.println("=======================================================");
                        System.out.println("O CLIENTE " + (i + 1) + " DEVE DINHEIRO.");
                        System.out.println("O CLIENTE " + (i + 1) + " ESTÁ DEVENDO: R$ " + debt);
                    } else if (debt > 0) {
                        System.out.println("=======================================================");
                        System.out
                                .println("O VALOR DO TROCO PARA O CLIENTE " + (i + 1) + " É DE: R$ " + Math.abs(debt));
                    } else {
                        System.out.println("=======================================================");
                        System.out.println("NÃO É NECESSÁRIO ENTREGAR TROCO.");
                    }
                    break;

                case 3:
                    // Mostrar Historico
                    // 3 Vetores de armazenamento
                    // 1-Informa a quantidade de plantas vendidas
                    // 2-Mostra o valor das vendas
                    // 3-Mostra os descontos aplicados

                    int[] quantitySold = new int[numberClients];
                    double[] salesValue = new double[numberClients];
                    double[] discountApplied = new double[numberClients];

                    for (int j = 0; j < numberClients; j++) {
                        quantitySold[j] = quantityPlant;
                        salesValue[j] = totalCost;

                        if (quantityPlant >= 10) {
                            discountApplied[j] = totalCost * 0.95;
                        } else {
                            discountApplied[j] = 0;
                        }
                    }

                    System.out.println("=======================================================");
                    System.out.println("HISTÓRICO DE COMPRAS DOS CLIENTES");

                    for (int k = 0; k < numberClients; k++) {
                        System.out.println("=======================================================");
                        System.out.println("CLIENTE " + (k + 1) + ": ");
                        System.out.println("QUANTIDADE DE PLANTAS VENDIDAS: " + quantitySold[k]);
                        System.out.println("VALOR DA VENDA: R$ " + salesValue[k]);
                        System.out.println("DESCONTO APLICADO: R$ " + discountApplied[k]);
                    }
                    break;

                case 4:// Histórico Mensal e/ou Anual

                    System.out.println("=======================================================");
                    System.out.println("HISTORICO MENSAL E/OU ANUAL");

                    System.out.print("\nINFORME O NUMERO DO MÊS (1 - 12): ");
                    month = scanner.nextInt();
                    System.out.print("INFORME O DIA DO MÊS (1 - 30): ");
                    day = scanner.nextInt();

                    if (month >= 1 && month <= 12 && day >= 1 && day <= 30) {
                        double totalSales = salesByMonthDay[month - 1][day - 1];
                        System.out.println("=======================================================");
                        System.out.println("VENDAS TOTAIS: DIA: " + day + ", DO MÊS " + month + ": R$ " + totalSales);
                    } else {
                        System.out.println("=======================================================");
                        System.out.println("MÊS OU DIA INVALIDOS");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("=======================================================");
                    System.out.println("ERRO 404: OPERAÇÃO INVÁLIDA");
                    break;
            }
            if (option == 1) {
                salesByMonthDay[month - 1][day - 1] += totalCost;
            }
        }
        scanner.close();
    }
}
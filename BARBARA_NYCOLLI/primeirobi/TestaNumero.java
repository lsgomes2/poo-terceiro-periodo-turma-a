package primeirobi;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();
        HashMap<String, Double> historico = new HashMap<>();

        boolean continuar = true;
        Scanner scan = new Scanner(System.in);

        while (continuar) {
            int escolha;

            System.out.println("Menu Console:\n" +
                    "[1] - Calcular Preço Total\n" +
                    "[2] - Calcular Troco\n" +
                    "[3] - Consultar Histórico\n" +
                    "[4] - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    calcularPrecoTotal(n, scan, historico);
                    break;

                case 2:
                    calcularTroco(n, scan, historico);
                    break;

                case 3:
                    consultarHistorico(historico);
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Inválido, tente novamente");
                    break;
            }
        }
        scan.close();
    }

    static void calcularPrecoTotal(Numero n, Scanner scan, HashMap<String, Double> historico) {
        System.out.println("Digite a quantidade da planta: ");
        int quantidadePlanta = scan.nextInt();
        System.out.println("Digite o preço da planta: ");
        double precoPlanta = scan.nextDouble();

        double precoTotal;
        if (quantidadePlanta > 10) {
            double desconto = precoPlanta * 0.1;
            precoTotal = n.multiplicacao(precoPlanta, quantidadePlanta) - desconto;
            System.out.println("Desconto de 10% aplicado.");
        } else {
            precoTotal = n.multiplicacao(precoPlanta, quantidadePlanta);
        }

        System.out.println("Preço total: " + precoTotal);

        historico.put("Preço Total", precoTotal);
    }

    static void calcularTroco(Numero n, Scanner scan, HashMap<String, Double> historico) {
        System.out.println("Digite o valor pago: ");
        double valorPago = scan.nextDouble();
        System.out.println("Digite o preço do produto: ");
        double precoProduto = scan.nextDouble();

        if (valorPago >= precoProduto) {
            double troco = n.subtracao(valorPago, precoProduto);
            System.out.println("Valor do troco: " + troco);
            historico.put("Venda Realizada", precoProduto);
        } else {
            System.out.println("Valor pago é insuficiente para o preço do produto.");
        }
    }

    static void consultarHistorico(HashMap<String, Double> historico) {
        System.out.println("Histórico de Transações:");
        for (String chave : historico.keySet()) {
            System.out.println(chave + ": " + historico.get(chave));
        }
    }
}

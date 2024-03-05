package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.ATIVIDADE_1;

import java.util.Scanner;

public class ATIVIDADE_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME A QUANTIDADE PLANTAS: ");
        int quantplanta = scanner.nextInt();

        System.out.println("PREÇO DAS PLANTAS: ");
        double precoplanta = scanner.nextDouble();

        System.out.println("VALOR QUE O CLIENTE PAGOU: R$ ");
        double valorcliente = scanner.nextDouble();

        System.out.println("ESCOLHA UMA DAS 3 OPÇÕES:\n[1] - CALCULAR PREÇO TOTAL\n[2] - CALCULAR TROCO\n[3] - SAIR");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:// PREÇO TOTAL
                double valortotal = quantplanta * precoplanta;
                System.out.println("O VALOR TOTAL É: R$ " + valortotal);
                break;

            case 2:// TROCO
                double valortotal2 = quantplanta * precoplanta;
                double trocofinal = valorcliente - valortotal2;
                System.out.println("DE R$ " + trocofinal + "AO CLIENTE");
                break;

            case 3:// SAINDO DO PROGRAMA
                System.out.println("ENCERRANDO O PROGRAMA");
                break;

            default:// MENSAGEM DE ERRO
                System.out.println("ERRO 404: OPÇÃO INVALIDA");
                break;
        }
        scanner.close();
    }
}

// PRIMEIRO PROBLEMA
// Entrada: Receber dois valores, primeiro a quantidade da referida planta,
// segundo a valor o preço da mesma.
// Saída: Retornar o resultado do cálculo.

// SEGUNDO PROBLEMA
// Entrada: Receber dois valores, primeiro o valor recebido pelo cliente,
// segundo o valor total da compra.
// Saída: Retornar o resultado do cálculo.

// TERCEIRO PROBLEMA
// [1] - Calcular Preço Total
// [2] - Calcular Troco
// [3] - Sair
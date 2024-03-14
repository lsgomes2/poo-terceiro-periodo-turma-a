package primeiro_bimestre.exemplos;

import java.util.Scanner;

import java.util.Scanner;

public class AulaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        int contadorVendas = 0;
        int tamanho = 100; // Tamanho inicial do vetor de vendas (pode ser ajustado conforme necessário)
        int[] vetorPlantas = new int[tamanho];
        float[] vetorVendas = new float[tamanho];
        float[] vetorDesconto = new float[tamanho];

        do {
            System.out.println("Menu:");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Valor total da compra");
            System.out.println("2. Valor do troco");
            System.out.println("3. Registro de Vendas");
            System.out.println("4. Sair do programa");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println();
                    System.out.println("Insira a quantidade de plantas: ");
                    int qntdPlanta = scanner.nextInt();

                    System.out.println("Insira o valor da planta: ");
                    float valorPlanta = scanner.nextFloat();

                    if (qntdPlanta <= 0 || valorPlanta <= 0) {
                        System.out.println("Valor inválido");
                        System.out.println();
                    } else {
                        float valorTotal = qntdPlanta * valorPlanta;
                        if (qntdPlanta > 10) {
                            float valorDesconto = valorTotal * 0.95f;
                            System.out.println("O valor a ser pago é " + valorDesconto + " reais");
                            vetorPlantas[contadorVendas] = qntdPlanta;
                            vetorVendas[contadorVendas] = valorDesconto;
                            vetorDesconto[contadorVendas] = valorTotal - valorDesconto;
                        } else {
                            System.out.println("O valor a ser pago é " + valorTotal + " reais");
                            vetorPlantas[contadorVendas] = qntdPlanta;
                            vetorVendas[contadorVendas] = valorTotal;
                            vetorDesconto[contadorVendas] = 0; // Sem desconto
                        }
                        contadorVendas++; // Incrementar o contador de vendas
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Insira o valor do pagamento do cliente: ");
                    float pagCliente = scanner.nextFloat();

                    System.out.println("Insira o valor total da compra: ");
                    float totalTroco = scanner.nextFloat();

                    if (totalTroco < 0 || pagCliente < 0) {
                        System.out.println("Valor inválido");
                        System.out.println();
                    } else if (pagCliente < totalTroco) {
                        System.out.println("O valor do pagamento do cliente é insuficiente!");
                        System.out.println();
                    } else {
                        float trocoCompra = pagCliente - totalTroco;
                        System.out.println("O troco é de " + trocoCompra + " reais");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Registro de Vendas:");
                    for (int i = 0; i < contadorVendas; i++) {
                        System.out.println("Venda " + (i + 1) + ":");
                        System.out.println("Quantidade de plantas: " + vetorPlantas[i]);
                        System.out.println("Valor total da compra: " + vetorVendas[i] + " reais");
                        System.out.println("Valor do desconto: " + vetorDesconto[i] + " reais");
                        System.out.println();
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                    break;
            }

        } while (escolha != 4);

    }
}


    


package primeiro_bimestre.exemplos;

import java.util.Scanner;

public class TestCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha, contadorVendas = 0;
        Venda[] vendas = new Venda[contadorVendas];

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

                    double valorTotal;

                    if (qntdPlanta <= 0 || valorPlanta <= 0) {
                        System.out.println("Valor inválido");
                        System.out.println();

                    } else {
                        valorTotal = qntdPlanta * valorPlanta;

                        //Quando um cliente compra mais de 10 plantas, 
                        //Dona Gabrielinha oferece um desconto especial de 5% no valor total da compra.

                        if (qntdPlanta > 10) {
                            double valorDesconto = valorTotal * 0.95; 
                            System.out.println("O valor a ser pago é " + valorDesconto + " reais");
                            System.out.println();  
                            Venda venda = new Venda(qntdPlanta, valorPlanta, valorDesconto, 0);
                            adicionarVenda(vendas, venda, contadorVendas);
                            contadorVendas++;
                        } else {
                            System.out.println("O valor a ser pago é " + valorTotal + " reais");
                            System.out.println();
                            Venda venda = new Venda(qntdPlanta, valorPlanta, valorTotal, 0);
                            adicionarVenda(vendas, venda, contadorVendas);
                            contadorVendas++;
                        }
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
                    imprimirVendas(vendas, contadorVendas);
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

    private static void imprimirVendas(Venda[] vendas, int contadorVendas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirVendas'");
    }

    private static void adicionarVenda(Venda[] vendas, Venda venda, int contadorVendas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarVenda'");
    }
    }
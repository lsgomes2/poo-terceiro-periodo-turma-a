package primeirobi;

import java.util.Scanner;

public class CalculadoraEspecializada {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu = 0; // Definição de inteiro para o while funcionar e seleção de operação
        int unidade; // Unidade de produto
        float pagamento; // Pagamento do cliente
        float preco; // Preço do produto
        float valor; // Valor total do produto  
        float resultado; // Resultado da operação sendo valor total ou troco

        while (menu != 3) { // While para o programa rodar até sair (selecionar 3 no menu)

        System.out.println("\nBem-vindo(a) à loja de plantas exóticas da Dona Gabrielinha!\n");// Introdução do menu
        System.out.println("[MENU] Selecione a operação desejada:"); // Seleção
        System.out.println("[1] - Calcular o Preço Total"); // Unidade multiplicado por preço
        System.out.println("[2] - Calcular o Troco"); // Pagamento menos o valor total
        System.out.println("[3] - Sair\n"); // Fechar o programa
        menu = entrada.nextInt(); // Entrada de dados do menu

        switch (menu) { // Switch com seleção do menu
            case 1: // [1] - Calcular o preço total
            System.out.println("\nInforme a unidade de produtos a pagar:\n");
            unidade = entrada.nextInt(); // Entrada de unidades de produtos em inteiro
    
            System.out.println("\nInforme o preço do produto:\n");
            preco = entrada.nextFloat(); // Entrada de preço do produto em float
    
            resultado = preco * unidade; // Multiplicação e resultado para o valor total
    
            if (resultado < 0) { // Caso o resultado for negativo
                System.out.println("\nErro!\n");
            } else {
            System.out.println("\nO valor total é de:\n");
            System.out.println("R$ " + resultado +"\n"); // Resultado preço total
            } 
                break; // Não passar para os próximos cases

            case 2: // [2] - Calcular o troco
            System.out.println("\nInforme o valor recebido pelo cliente:\n");
            pagamento = entrada.nextFloat(); // Entrada do pagamento do cliente em float

            System.out.println("\nInforme o valor total da compra:\n");
            valor = entrada.nextFloat(); // Entrada do valor total em float

            resultado = pagamento - valor; // Subtração e resultado para o troco

            if (resultado < 0) { // Caso o resultado for negativo
                System.out.println("\nErro!\n");
            } else {
            System.out.println("\nO troco do cliente é de:\n");
            System.out.println("R$ " + resultado + "\n"); // Resultado troco
            }
            break; // Não passar para os próximos cases

            case 3: // [3] - Sair

            System.out.println("\nPrograma Finalizado!\n"); // Encerrar o programa

            default: // Caso não haver resposta correta de 1 á 3
                break; // Fim do switch
        }

        } // Fim do while

        entrada.close(); // Fim da entrada de dados
    }
}

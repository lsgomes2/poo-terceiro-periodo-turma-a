package KAUA_MATHEUS.primeiro_bimestre;
import java.util.Scanner;
import java.lang.Thread;

/**
 * calculadora_ex001
 * 
 * A calculadora deve ser capaz de realizar as seguintes operações:

1. Cálculo de Preço Total:
    Dona Gabrielinha deseja calcular o preço total da venda de um item, considerando a quantidade de uma planta vendida vezes seu preço unitário.
   
    Entrada: Receber dois valores, primeiro a quantidade da referida planta, segundo a valor o preço da mesma.
    Saída: Retornar o resultado do cálculo.
   
2. Cálculo de Troco:
    A calculadora deve calcular o troco a ser dado ao cliente, considerando o valor pago.
   
    Entrada: Receber dois valores, primeiro o valor recebido pelo cliente, segundo o valor total da compra.
    Saída: Retornar o resultado do cálculo.

3. Criar Menu Console:
    [1] - Calcular Preço Total
    [2] - Calcular Troco    
    [3] - Sair    

INFORMAÇÕES IMPORTANTES!
A ENTREGA CONSISTE NO LINK DO PULL REQUEST DO SEU GIT.
APÓS ADICIONADO O LINK, MARCAR ATIVIDADE COMO ENTREGUE!
ENTREGAS EM ATRASO SERÁ DESCONTADO METADE DA NOTA!!
APÓS UMA SEMANA DA DATA INICIAL DA ATIVIDADE, NÃO SERÁ MAIS POSSÍVEL REALIZAR ENTREGA.
 */

public class calculadora_ex001 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException {

        // Criação de um Scanner
        Scanner scanner = new Scanner(System.in);

        int opção;
        do {
            // Menu de Opções
            opção = MostraMenu();

            switch (opção) {
                case 1:
                    float preço = preçototal();
                    System.out.format("\u001B[31mO valor total da compra é %.2f\n\u001B[m", preço);
                    break;
                case 2:
                    float troco = valortroco();
                    System.out.format("\u001B[31mO valor de troco é %.2f\n\u001B[m", troco);
                    break;

                case 3:
                    break;
                default:
                    System.out.println("O valor digitado é inválido!");
                    break;
            }
            Thread.sleep(1000);


        } while(opção != 3);

    }

    // Mostra menu
        public static int MostraMenu(){
            System.out.println("\n===Menu===");
            System.out.println("1 - Calcular Preço Total\n");
            System.out.println("2 - Calcular Troco\n");
            System.out.println("3 - Sair: ");

            Scanner scanner = new Scanner(System.in);
            return Integer.parseInt(scanner.nextLine());

        }

        // Preço Total
        public static float preçototal(){
        /*
        Calculo Preço Total:
        Dona Gabrielinha deseja calcular o preço total da venda de um item, considerando a quantidade de uma planta vendida vezes seu preço unitário.
   
        Entrada: Receber dois valores, primeiro a quantidade da referida planta, segundo a valor o preço da mesma.
        Saída: Retornar o resultado do cálculo.
         */ 

        // Definição de Scanner
        Scanner scanner = new Scanner(System.in);


        // Quantidade de Produto
        int quantidade_produto;
        System.out.println("Digite a quantidade da planta: ");
        quantidade_produto = Integer.parseInt(scanner.nextLine());
        
        // Preço do produto
        System.out.println("Qual é o Preço unitário da planta? ");
        float preço_produto = Float.parseFloat(scanner.nextLine());

        // Valor Final
        float valor_final = preço_produto * quantidade_produto;
        return valor_final;
        }

        // Troco da compra
        public static float valortroco(){
            /*
            * 2. Cálculo de Troco:
            A calculadora deve calcular o troco a ser dado ao cliente, considerando o valor pago.

            Entrada: Receber dois valores, primeiro o valor recebido pelo cliente, segundo o valor total da compra.
            Saída: Retornar o resultado do cálculo.
             */

            Scanner scanner = new Scanner(System.in);

            System.out.println("Valor Recebido: ");
            float valor_recebido = Float.parseFloat(scanner.nextLine());
            System.out.println("Valor da Compra: ");
            float  valor_pago = Float.parseFloat(scanner.nextLine());

            float troco_final = valor_recebido - valor_pago;
            if (troco_final < 0){
                System.out.println("valor pago insuficiente! ");
                return 0;
            }
            else{
                return troco_final;
            }
        }
    
}
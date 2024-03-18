package KAUA_MATHEUS.primeiro_bimestre;
import java.util.Scanner;
import java.lang.Thread;

/**
 Dona Gabrielinha ficou muito feliz com o software desenvolvido, porém, na utilização ela observou que poderia melhorar mais o sistema para lhe 
ajudar em pontos que ela não tinha se atentado no início.

Ela te contatou novamente e pediu as seguintes alterações no sistema:

1. Desconto Especial:
    Quando um cliente compra mais de 10 plantas, Dona Gabrielinha oferece um desconto especial de 5% no valor total da compra.
   
    Entrada: Receber dois valores, primeiro a quantidade da referida planta, segundo a valor o preço da mesma.
    Saída: Retornar caso a quantidade informada for maior que 10 realizar o desconto.
   
2. Registro de Vendas:
    Dona Gabrielinha deseja manter um registro das vendas, incluindo a quantidade de plantas vendidas, o valor venda e os descontos aplicados.
   
    Entrada: Venda realizada sistema
    Saída: Armazenamento desses dados no sistema.

3. Adicionar ao menu existente função 2 e aprimorar cálculo do valor a pagar com a função 1.

Espero que nessa atividade leve em conta convenções de nomenclatura, para fazer um código mais limpo e compreensivo.

INFORMAÇÕES IMPORTANTES
* A ENTREGA CONSISTE NO LINK DO PULL REQUEST DO SEU GIT.
* APÓS ADICIONADO O LINK, MARCAR ATIVIDADE COMO ENTREGUE!
* NÃO SERÁ ACEITO ENTREGA APÓS A DATA!
 */

public class calculadora {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException {

        // Criação de Arquivos!
        //Barquivo.criaArquivos("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt", "123\n");

        // Deletar Arquivos!
        //Barquivo.apagaArquivo("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt");

        // Ler Arquivos!!
        //Barquivo.lerTexto("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt");


        // Criação de um Scanner
        Scanner scanner = new Scanner(System.in);

        int opção;
        do {
            // Menu de Opções
            opção = MostraMenu();

            switch (opção) {
                case 1:
                    /*
                    Calculo Preço Total:
                    Dona Gabrielinha deseja calcular o preço total da venda de um item, considerando a quantidade de uma planta vendida vezes seu preço unitário.
            
                    Entrada: Receber dois valores, primeiro a quantidade da referida planta, segundo a valor o preço da mesma.
                    Saída: Retornar o resultado do cálculo.
                    */ 

                    // Quantidade de Produto
                    int quantidade_produto;
                    System.out.println("Digite a quantidade da planta: ");
                    quantidade_produto = Integer.parseInt(scanner.nextLine());

                    // Preço do produto
                    System.out.println("Qual é o Preço unitário da planta? ");
                    float preço_produto = Float.parseFloat(scanner.nextLine());

                    float valor_final = preço_produto * quantidade_produto;

                    if(quantidade_produto > 10){
                        valor_final *= 0.95;
                        System.out.format("\u001B[31mO valor total da compra é %.2f\n\u001B[m", valor_final * 0.95);
                    } else{
                        System.out.format("\u001B[31mO valor total da compra é %.2f\n\u001B[m", valor_final);
                    }
                        
                    
                    break;
                case 2:
                    /*
                    * 2. Cálculo de Troco:
                    A calculadora deve calcular o troco a ser dado ao cliente, considerando o valor pago.

                    Entrada: Receber dois valores, primeiro o valor recebido pelo cliente, segundo o valor total da compra.
                    Saída: Retornar o resultado do cálculo.
                    */

                    System.out.println("Valor Recebido: ");
                    float valor_recebido = Float.parseFloat(scanner.nextLine());
                    System.out.println("Valor da Compra: ");
                    float  valor_pago = Float.parseFloat(scanner.nextLine());

                    float troco_final = valor_recebido - valor_pago;
                    while (troco_final < 0){
                        System.out.println("valor pago insuficiente! ");
                        System.out.println("\u001B[31mDigite novamente um pagamento válido: \u001B[m");
                        valor_recebido = Float.parseFloat(scanner.nextLine());
                        System.out.format("\u001B[32mO troco é: %.2f\n\u001B[m", troco_final = valor_recebido - valor_pago);
                    }
                    break;

                case 3:
                    System.out.println("Tem certeza que deseja apagar a lista de itens comprados? Sim - [1] / Não - [0]");
                    int confirmar = Integer.parseInt(scanner.nextLine());
                    if(confirmar == 1){
                        apagar("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt");
                    }
                    else{
                        System.out.println("\u001B[31mNada foi apagado\u001B[m");
                        break;
                    }
                

                case 4:
                    break;

                default:
                    System.out.println("O valor digitado é inválido!");
                    break;
            }
            Thread.sleep(1000);


        } while(opção != 4);

    }

    // Mostra menu
        public static int MostraMenu(){
            System.out.println("\n===Menu===");
            System.out.println("1 - Calcular Preço Total\n");
            System.out.println("2 - Calcular Troco\n");
            System.out.println("3 - Apagar Histórico do Estoque: \n");
            System.out.println("4 - Fechar do Aplicativo: ");

            Scanner scanner = new Scanner(System.in);
            return Integer.parseInt(scanner.nextLine());

        }
    
        public static void apagar(String caminho_Arquivo){
            Barquivo.apagaArquivo(caminho_Arquivo);
        }
    }
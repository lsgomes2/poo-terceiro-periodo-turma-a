package KAUA_MATHEUS.primeiro_bimestre;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread;

public class calculadora {
    @SuppressWarnings({ "resource"})
    public static void main(String[] args) throws InterruptedException {

        // String caminho_Arquivo = "KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt";

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

                // Cálculo de venda
                case 1:

                    // Quantidade de Produto
                    int quantidade_produto;
                    System.out.println("Digite a quantidade da planta: ");
                    quantidade_produto = Integer.parseInt(scanner.nextLine());

                    // Preço do produto
                    System.out.println("Qual é o Preço unitário da planta? ");
                    float preço_produto = Float.parseFloat(scanner.nextLine());

                    float valor_final = preço_produto * quantidade_produto;
                    float desc = valor_final;

                    if(quantidade_produto > 10){
                        valor_final *= 0.95;
                        System.out.format("\u001B[31mO valor total da compra é %.2f\n\u001B[m", valor_final);
                    } else{
                        System.out.format("\u001B[31mO valor total da compra é %.2f\n\u001B[m", valor_final);
                    }

                    desc = desc - valor_final;

                    // Criação de arquivo txt contendo o conteúdo

                    criaArquivos("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt", "Qnt: " + 
                    quantidade_produto + " -- Preço: R$" + 
                    preço_produto + " -- Desconto Total: " +
                    String.format("R$%.2f", (desc)) + "\n");

                    break;
                    
                // Cálculo de troco
                case 2:

                    // Entrada de valor

                    System.out.println("Valor Recebido: ");
                    float valor_recebido = Float.parseFloat(scanner.nextLine());

                    // Total da compra
                    System.out.println("Valor total da compra: ");
                    float valor_total = Float.parseFloat(scanner.nextLine());


                    float troco_final = valor_recebido - valor_total;
                    
                    while (0 > troco_final){
                        System.out.println("valor pago insuficiente! ");
                        System.out.println("\u001B[31mDigite novamente um pagamento válido: \u001B[m");
                        valor_recebido = Float.parseFloat(scanner.nextLine());
                        troco_final = valor_recebido - valor_total;
                    }
                    System.out.format("\u001B[32mO troco é: %.2f\n\u001B[m", troco_final);

                    break;

                // Mostra Lista
                case 3:
                    
                        int sair = 0;
                        
                        lerTexto("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt");
                        while (sair != 1) {
                            System.out.println("[1] - Sair");
                            sair = Integer.parseInt(scanner.nextLine());
                        }
                        break;
                
                // Apaga o Arquivo Txt
                case 4:
                    System.out.println("Tem certeza que deseja apagar a lista de itens comprados? Sim - [1] / Não - [0]");
                    int confirmar = Integer.parseInt(scanner.nextLine());
                    if(confirmar == 1){
                        apagar("KAUA_MATHEUS/primeiro_bimestre/arquivoCompras.txt");
                    }
                    else{
                        System.out.println("\u001B[31mNada foi apagado\u001B[m");
                    }
                    break;
                
                // Sair do Sistema
                case 5:
                    System.exit(0);
                    break;

                // Loop de entrada
                default:
                    System.out.println("O valor digitado é inválido!");
                    break;
            }

            // Delay
            Thread.sleep(1000);


        } while(opção != 3);

    }

    // Mostra menu
        public static int MostraMenu(){
            System.out.println("\n===Menu===");
            System.out.println("1 - Entrada de Compra\n");
            System.out.println("2 - Cálculo de troco\n");
            System.out.println("3 - Visualizar Histórico de Compra\n");
            System.out.println("4 - Apagar Histórico de Compra \n");
            System.out.println("5 - Fechar do Aplicativo ");
            

            Scanner scanner = new Scanner(System.in);
            return Integer.parseInt(scanner.nextLine());

        }
    
        public static void apagar(String caminho_Arquivo){
            apagaArquivo(caminho_Arquivo);
        }


        public static void lerTexto(String pCaminhoArquivo){

        int contador_linha = 0;

        try(

            BufferedReader buffReader = new BufferedReader(new FileReader(pCaminhoArquivo))
        ){
                String linha = "";

                while(true){
                    if(linha != null){
                        System.out.println(linha);
                        contador_linha += 1;
                    }else{
                        break;
                    }
                    linha = buffReader.readLine();
                }
                if(contador_linha > 0){
                    System.out.println(contador_linha - 1);
                }
                else{
                    System.out.println(0);
                }
                
            }catch (IOException e){
                e.printStackTrace();
            }

    }

    public static void criaArquivos(String pCaminhoArquivo, String pTextoAEscrever){
        try(

            FileWriter criadorDeArquivos = new FileWriter(pCaminhoArquivo, true);
            BufferedWriter buffer = new BufferedWriter(criadorDeArquivos);
            PrintWriter escritorDeArquivos = new PrintWriter(buffer);
        
        ){
            escritorDeArquivos.append(pTextoAEscrever);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void apagaArquivo(String pCaminhoArquivo){

        File file = new File(pCaminhoArquivo);

        if(file.delete()){
            System.out.format("\u001B[31mO arquivo foi apagado com sucesso! \u001B[m");   
        }

        else{
            System.out.println("\u001B[31mErro ao tentar apagar arquivo! \u001B[m");
        }
    }

    }

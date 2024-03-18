package firsttwomonths.exercises;

import java.util.Scanner;

public class sistemaDonaGabriela2 {
    
    public static int validating(String text) {                                       // Função criada para validar se a String recebida é somente 1 digito numérico.

        if (text.length() == 1 && Character.isDigit(text.charAt(0))) {          

            int integer = Integer.parseInt(text);                                     

            return integer;


        } else {                                                                      

            return 0;

        }
    }

    
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] registers = new String[100];

        registers [0] = "\tLista de Registros:";

        int index = 1;

        while (true) {


            System.out.println("\n [1] - Calcular Preço Total. \n [2] - Calcular Troco. \n [3] - Inserir um registro."
            + "\n [4] - Exibir Registros. \n [5] - Remover último registro. \n [6] - Limpar todos os registros. \n [7] - Sair. ");

            String reader = scanner.nextLine();

            
            int option = validating(reader);                                            // É adicionado à variável "option" o retorno da Função "validating".             
                                                                                    
            
            switch (option) {                                                           // Utilizando o Switch Case para selecionar a opção correspondente.
                                                                          

                case 1:                                                                 // Caso 1, irá cadastrar uma venda e automaticamente adicionar aos registros.

                    System.out.println("\n Informe o valor da planta:");
                    float price = scanner.nextFloat();

                    System.out.println("Informe a quantidade:");
                    int amount = scanner.nextInt();

                    double total = price * amount;

                    if (amount >= 10) {
                        
                        total = total - (total * 0.05);

                        System.out.println("-------------------------------------------------");
                        System.err.println("\t Valor por Planta: \tR$" + price + "\n\t Quantidade adquiria: \t" + amount + " (5% Aprovado)"
                                + "\n\t Valor total: \tR$" + total);
                        System.out.println("-------------------------------------------------");
                    }

                    else{

                        System.out.println("-------------------------------------------------");
                        System.err.println("\t Valor por Planta: \tR$" + price + "\n\t Quantidade adquiria: \t" + amount
                                + "\n\t Valor total: \tR$" + total);
                        System.out.println("-------------------------------------------------");
                    }

                    registers[index] = "Registro [" +index+ "]: " +amount+ " Plantas - Total: R$" +total;

                    index += 1;

                    break;


                case 2:                                                                     // Caso 2, irá realizar o cálculo de troco.

                    System.out.println("\n Informe o valor recebido pelo cliente:");
                    float money = scanner.nextFloat();

                    System.out.println("Informe o valor da compra:");
                    float sale = scanner.nextFloat();

                    System.out.println("-------------------------------------------------");
                    System.err.println("\t Valor da compra: R$" + sale + "\n\t Valor pago: R$ " + money
                            + "\n\t Troco: R$" + (money - sale));
                    System.out.println("-------------------------------------------------");

                    break;


                case 3:                                                                     // Caso 3, irá inserir um novo registro manualmente.

                    System.out.println("\n Informe o registro completo a ser inserido:");
                    String insert_register = scanner.nextLine();

                    registers[index] = "Registro [" +index+ "]: " +insert_register;
                    index += 1;
                    
                continue;


                case 4:                                                                     // Caso 4, irá listar todos os registros no vetor.

                    for(int i=0; i<registers.length; i++){
                        if (registers[i] != null) {
                            
                            System.out.println("\n" + registers[i]);
                            
                        }
                    }

                    continue;

                case 5:                                                                     // Caso 5, irá remover o último item do vetor
                    
                    System.out.println(registers[index-1]+ " (REMOVIDO)");

                    registers[index-1] = null;

                    index -= 1;

                    continue;


                case 6:                                                                     // Caso 6, irá zerar o vetor, deixando somente a primeira posição - registers[0] = "\tLista de Registros:"

                    for(int i=1; i<registers.length; i++){
                        if (registers[i] != null) {
                            
                            registers[i] = null;
                            
                        }
                    }

                    System.out.println("REGISTROS ZERADOS!");
                    
                    index = 1;

                    continue;


                case 7:                                                                     // Caso 7, finaliza o sistema.

                    System.exit(0);

                
                default:                                                                    // Qualquer outro elemento inserido irá reiniciar o loop.
                                                                                        
                    System.out.println("\n\t\t Digite um número válido.");            
                    continue;                                                                       
            }

            
            scanner.nextLine();

        }
    }
}

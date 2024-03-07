package firsttwoweeks.exercise_1;

import java.util.Scanner;

public class donagabrielinha {
    
    public static int validating(String text) {                                       // Função criada para validar se a String recebida é somente 1 digito numérico.

        if (text.length() == 1 && Character.isDigit(text.charAt(0))) {          // Este if verifica se a String recebida tem apenas 1 posição e se esta posição é um digito.

            int integer = Integer.parseInt(text);                                     // Sendo digito válido a função retorna ele como Inteiro.

            return integer;


        } else {                                                                      // Caso não for um número válido a função retorna ela mesma passando o valor 0 (motivo do '0' explicado a diante).

            return 0;

        }
    }

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.println("\n [1] - Calcular Preço Total \n [2] - Calcular Troco \n [3] - Sair");
            String reader = scanner.nextLine();

            
            int option = validating(reader);                                            // É adicionado a variável "option" o retorno da Função "validating".             
                                                                                    
            
            switch (option) {                                                           // Utilizando o Switch Case para selecionar a opção correspondente.
                case 1: 

                    System.out.println("\n Informe o valor da planta:");
                    float price = scanner.nextFloat();

                    System.out.println("Informe a quantidade:");
                    int amount = scanner.nextInt();

                    System.out.println("-------------------------------------------------");
                    System.err.println("\t Valor por Planta: \tR$" + price + "\n\t Quantidade adquiria: \t" + amount
                            + "\n\t Valor total: \tR$" + price * amount);
                    System.out.println("-------------------------------------------------");

                    break;

                case 2:

                    System.out.println("\n Informe o valor recebido pelo cliente:");
                    float money = scanner.nextFloat();

                    System.out.println("Informe o valor da compra:");
                    float sale = scanner.nextFloat();

                    System.out.println("-------------------------------------------------");
                    System.err.println("\t Valor da compra: R$" + sale + "\n\t Valor pago: R$ " + money
                            + "\n\t Troco: R$" + (money - sale));
                    System.out.println("-------------------------------------------------");

                    break;

                case 3:

                    System.exit(0);

                default:   
                                                                                        // Com a função "validating" aceitamos todas as entradas de 1 posição com digito numérico.
                    System.out.println("\n\t\t Digite um número válido.");            // Através do Default desconsideramos todas as opções diferes de "1, 2, 3". 
                    continue;                                                           // Por esse motivo o retorno de "0" da função quando não estiver no padrão( != (1, 2, 3) ).                   
            }
            

            scanner.nextLine();                                                         // Utilizando o nextLine ao final para limpar o Buffer,
                                                                                        // sem o 'nextLine', na segunda passada pelo loop ele considera o "enter" pressionado como
                                                                                        // caractere, o que acarreta numa passagem direta.
        }
    }
}
package primeirobi;

import java.util.Scanner;

public class activitie1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int qnt_planta, contador = 0;
        float valor_planta, valor_recebido = 0;
        float valor_total = 0;

        while (contador != 3) {
            
            System.out.println("\n Escolha uma opção: \n 1: Calcular preco \n 2: Calcular troco \n 3: Sair \n");
            contador = scan.nextInt();
            scan.nextLine();

            if (contador == 1) {
                System.out.println("\n Quantas plantas o cliente comprou? \n");
                qnt_planta = scan.nextInt();
                scan.nextLine();

                System.out.println("\n Qual o valor da(s) plantas? \n");
                valor_planta = scan.nextInt();
                scan.nextLine();

                if (qnt_planta <= 0 || valor_planta <= 0 ) {

                    System.out.println("VALORES INVÁLIDOS");
                }
                else {
                valor_total = qnt_planta * valor_planta;
                System.out.println("O valor total a ser pago é de R$:" + valor_total);
                scan.nextLine();
                }
            }
            else if (contador == 2) {
                System.out.println("\n Qual o valor total da compra?"); // TROCO INDEPENDE DO VALOR COLOCADO ACIMA
                valor_total = scan.nextInt();

                System.out.println("\n Qual o valor recebido pelo cliente? \n");
                valor_recebido = scan.nextInt();
                scan.nextLine();

                if (valor_recebido > valor_total && valor_total > 0) {

                    System.out.println("O troco sera R$:" + (valor_recebido - valor_total));
                    scan.nextLine();
                }
                else if (valor_recebido == valor_total && valor_total > 0) {
                    System.out.println("Não há troco a ser pago!");
                    scan.nextLine();
                }
                else {
                    System.out.println("VALOR INVALIDO");
                    scan.nextLine();
                }
            }
        }
    }
}

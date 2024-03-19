package primbi;

import java.util.Scanner;

public class donagabriela {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int c;

        do {
            System.out.println("Escolha :");
            System.out.println("1 - Calculadora total");
            System.out.println("2 - Calculadora troco");
            System.out.println("3 - Sair");

            c = scanner.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Quantidade da planta: ");
                    int quant = scanner.nextInt();

                    System.out.println("Preço da planta: ");
                    double precou = scanner.nextDouble();

                    double total = quant * precou;
                    System.out.println("Preço total: " + total);
                    break;
                case 2:

                    System.out.println("Valor total da compra: ");
                    double valorc = scanner.nextDouble();

                    System.out.println("Valor recebido: ");
                    double recebe = scanner.nextDouble();

                    double troco = recebe - valorc;
                    
                    if (troco >= 0) {
                        System.out.println("Troco: " + troco);
                    } else {
                        System.out.println("Valor recebido insuficiente ");
                    }
                    break;
                case 3:
                    System.out.println("Desligando");
                    break;
                default:
                    System.out.println("Comando errado!");
            }
        } while (c != 3);

        scanner.close();
    }
}

package primeirobi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CALCULADORA {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        System.out.println("\n**Calculadora de Gabrielinha**\n");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");

        System.out.println("Digite a opção desejada:");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calculaoPrecoTotal();
                break;
            case 2:
                calculaoTroco();
                break;
            case 3:
                System.out.println("Obrigado por usar a calculadora!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (opcao != 3) {
            main(null);
        }
    }

    private static void calculaoPrecoTotal() {
        System.out.println("Digite a quantidade da planta:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário da planta:");
        double precounitario = scanner.nextDouble();

        double precototal = quantidade * precounitario;

        System.out.printf("O preço total da venda é: R$ %s\n", df.format(precototal));
    }

    private static void calculaoTroco() {
        System.out.println("QUANTO QUE O CLIENTE PAGOU:");
        double valorpg = scanner.nextDouble();

        System.out.println("QUANTO DEU A COMPRA:?");
        double valortotal = scanner.nextDouble();

        double troco = valorpg - valortotal;

        System.out.printf("VOCE TEM QUE VOLTAR PARA O CLIENTE: R$ %s\n", df.format(troco));
    }
}

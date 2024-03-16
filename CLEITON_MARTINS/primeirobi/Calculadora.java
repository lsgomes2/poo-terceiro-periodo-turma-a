package primeirobi;
import java.util.Scanner;
public class Calculadora 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        float preco = 0;
        float pagamento = 0;
        float valorTotal = 0;
        float troco = 0;
        int opcao;

        System.out.println("insira a quantidade do produto");
        quantidade = scanner.nextInt();

        System.out.println("insira o preço do produto");
        preco = scanner.nextFloat();

        valorTotal = quantidade * preco;
        
        System.out.println("Insira o valor em reais dado pelo cliente:");
        pagamento = scanner.nextFloat();

        if (pagamento < valorTotal) 
        {
            System.out.println("Quantidade insuficiente, você precisa de mais dinheiro.");
        }

        troco = pagamento - valorTotal;

        System.out.println("1. Visualizar o valor total");
        System.out.println("2. Visualizar o troco");
        System.out.println("3. Sair");

        opcao = scanner.nextInt();

        switch (opcao) 
        {
            case 1:
                System.out.println("O valor total é de " + (valorTotal) + " reais.");
                break;
            case 2:
                System.out.println("O troco será de " + troco + " reais.");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção incorreta.");
        }

        scanner.close();
    }
}

package primeirobi;
import java.util.Scanner;
public class Calculadora 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        double preco = 0;
        double pagamento = 0;
        double valorTotal = 0;
        double troco = 0;
        double desconto = 0;
        int informarValores;
        
        System.out.println("insira a quantidade do produto");
        quantidade = scanner.nextInt();

        System.out.println("insira o preço do produto");
        preco = scanner.nextFloat();
        
        valorTotal = quantidade * preco;

        System.out.println("Insira o valor em reais dado pelo cliente:");
        pagamento = scanner.nextFloat();

        if (pagamento < valorTotal) 
        {
            System.out.println("Quantidade insuficiente, você precisa de mais dinheiro. ");
        }
        
        if (quantidade >= 10)
        {
            desconto = valorTotal * 0.95;
            troco = pagamento - desconto;
            System.out.println("o valor final com desconto é de " + desconto + " reais");
        }
        else
        {
            troco = pagamento - valorTotal;
        }

        System.out.println("1. Visualizar o valor total");
        System.out.println("2. Visualizar o troco");
        System.out.println("3. Sair");

        informarValores = scanner.nextInt();

        switch (informarValores) 
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

        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];
        double[] vetor3 = new double[5];

        for (int i=0; i<5; i++)
        {
            vetor1[i] = quantidade;
            vetor2[i] = preco;
            vetor3[i] = desconto;
        }

        System.out.println("insira uma das opções abaixo para conferir as informações descritas:");
        System.out.println("1 - quantidade de plantas vendidas");
        System.out.println("2 - valor da venda");
        System.out.println("3 - valor do desconto aplicado");

        int conferirVendas = scanner.nextInt();
        
        switch (conferirVendas)
        {
	        case 1:
		        System.out.println("a quantidade plantas vendidas é de: " + vetor1[0]);
		    break;
	        case 2:
		        System.out.println("o valor da venda é de: " + vetor2[0]);
		    break;
	        case 3:
		        System.out.println("o valor do desconto aplicado é de: " + vetor3[0]);
		    break;
	        default:
		        System.out.println("insira uma alternativa válida!");
        }

        scanner.close();
    }
}
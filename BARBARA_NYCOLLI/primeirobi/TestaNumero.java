package primeirobi;      
    
    import java.util.HashMap;
    import java.util.Scanner;
    
    public class TestaNumero {
        public static void main(String[] args) { 
            Numero n = new Numero();
            
            boolean continuar = true;
    
            Scanner scan = new Scanner(System.in); 
            while (continuar) {
                int escolha;
    
                System.out.println("Menu Console:\n" +
                                   "[1] - Calcular Preço Total\n" +
                                   "[2] - Calcular Troco\n" +
                                   "[3] - Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scan.nextInt();
    
                switch (escolha) {
                    case 1:
                        calcularPrecoTotal(n, scan);
                        break;
    
                    case 2:
                        calcularTroco(n, scan);
                        break;
    
                    case 3:
                        continuar = false;
                        System.out.println("Programa encerrado");
                        break;
    
                    default:
                        System.out.println("Inválido, tente novamente");
                        break;
                }
            }
            scan.close(); 
        }  
    
        static void calcularPrecoTotal(Numero n, Scanner scan) {
            System.out.println("Digite o preço do produto: ");
            double precoProduto = scan.nextDouble();
            System.out.println("Digite a quantidade de produtos: ");
            double quantidade = scan.nextDouble();
    
            double precoTotal = n.multiplicacao(precoProduto, quantidade);
            System.out.println("Preço total: " + precoTotal);
        }
    
        static void calcularTroco(Numero n, Scanner scan) {
            System.out.println("Digite o valor pago: ");
            double valorPago = scan.nextDouble();
            System.out.println("Digite o preço do produto: ");
            double precoProduto = scan.nextDouble();
    
            double troco = n.subtracao(valorPago, precoProduto);
            System.out.println("Valor do troco: " + troco);
        }
    }
    

package BIM1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        ArrayList<Integer> listaQuant = new ArrayList<>();
        ArrayList<Integer> listaValor = new ArrayList<>();
        ArrayList<Integer> listaDesc = new ArrayList<>();

        do
        {
            System.out.println("\nSeleciona a ação:\n[1]Cálculo de preço total\n[2]Cálculo de troco\n[3]Sair\n[4]Historico de vendas\n");
            opc = scanner.nextInt();

            switch(opc)
            {
                case 1:
                System.out.println("Qual a quantidade de plantas?");
                int quant = scanner.nextInt();

                System.out.println("Qual o valor da espécie de planta escolhida?");
                int prec = scanner.nextInt();

                double valtot = (quant*prec);
                System.out.println("O valor da compra ficou: " + valtot);

                if (quant>=10)
                {
                    valtot = valtot-(valtot*0.05);
                    System.out.println("Receba seus 5%, o valor com desconto ficou " + valtot);
                }

                listaQuant.add(quant);
                listaValor.add(prec);
                listaDesc.add(quant >= 10 ? 5 : 0);

                break;

                case 2:
                System.out.println("Quanto será pago pelo cliente?");
                int pag = scanner.nextInt();
                System.out.println("Qual o total do compra?");
                int valtot2 = scanner.nextInt();
                float troco = (pag-valtot2);
                if (troco>=0)
                {
                    System.out.println("O troco é:" + troco);
                }
                else
                {
                    System.out.println("O pagamento não é suficiente para a compra");
                }
                break;

                case 3:
                System.out.print("Operação encerrada");
                scanner.close();
                break;
                
                case 4:
                System.out.print ("Historico de vendas:\n");
                for (int i = 0; i < listaQuant.size(); i++) 
                {
                    System.out.println("\nQuantidade: " + listaQuant.get(i) + "\n Valor: " + listaValor.get(i) + "\n Desconto: " + listaDesc.get(i) + "%");
                }
                break;
                
                default:
                System.out.print("Opção inválida");
                break;
            }
        } while (opc!=3);
    }
}

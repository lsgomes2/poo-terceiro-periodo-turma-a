package PRIMEIRO_BI;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int maisproduto;
            int[] vetor = new int[100];
            int contador=0;
            do {
                System.out.println("Quantidade da planta:");
                int qnt = scanner.nextInt();
    
                System.out.println("Valor da planta:");
                int val = scanner.nextInt();
                
                int tot = val * qnt;
                if(qnt>10){
                    tot = (int) (tot - (0.05 * (double) tot));
                }
                vetor[contador] = tot;

                System.out.println("Valor recebido:");
                int receba = scanner.nextInt();
    
                int verifi = 0;
                contador++;
                while(verifi == 0){
                System.out.println("Menu\n [1]Preço total\n [2]Troco\n [3]Registro de vendas\n [4]Sair");
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                    System.out.println("Preço total: "+tot);
                        break;
                    case 2:
                    if(tot<receba){
                        System.out.println("Troco a ser dado: "+(receba - tot));
                        }
                        if(receba<tot){
                            System.out.println("Valor faltando:"+(tot - receba));
                        }
                        break;
                    case 3:
                    for(int i=0;i<contador;i++){
                       int n=i+ 1; 
                        System.out.println("Compra "+n+": "+vetor[i]);
                
                    }
    
                        break;
                    case 4:
                    verifi = 1;
                        break;
                    default:
                    System.out.println("Numero invalido");
                        break;
                }
         }
         System.out.println("Deseja adicionar mais um produto?\n[1]Sim\n[2]Nao");
         maisproduto = scanner.nextInt();
            } while (maisproduto==1);
        }
    }
}

package PRIMEIRO_BI;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade da planta:");
        int qnt = scanner.nextInt();

        System.out.println("Valor da planta:");
        int val = scanner.nextInt();

        int tot = val * qnt;

        System.out.println("Valor recebido:");
        int receba = scanner.nextInt();

        int verifi = 0;

        while(verifi == 0){
        System.out.println("Menu\n [1]Preço total\n [2]Troco\n [3]Sair");
        int menu = scanner.nextInt();
        if(menu==1){
            System.out.println("Preço total: "+tot);
        }
        if(menu==2){
            if(tot<receba){
            System.out.println("Troco a ser dado: "+(receba - tot));
            }
            if(receba<tot){
                System.out.println("Valor faltando:"+(tot - receba));
            }
        }
        if(menu==3){
            verifi = 1;
        }
        if(menu<1&&menu>3){
            System.out.println("Numero invalido");
        }
        }
    }
}

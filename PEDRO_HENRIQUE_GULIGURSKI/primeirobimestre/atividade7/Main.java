package primeirobimestre.atividade7;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menuInicial = "[1] - Adicionar Itens à Sacola\n" // Deve abrir o "menuItens"
            .concat("[2] - Verificar Sacola\n") // Deve mostrar o preço total
            .concat("[3] - Finalizar Compra\n") // Deve solicitar o pagamento e mostrar o preço do troco (se houver)
            .concat("[4] - Sair"); // Deve encerrar a aplicação

        String menuItens = "[1] - Listar Itens\n" // Dá a opção de digitar o ID para adicionar a sacola, ou 0 para voltar
            .concat("[2] - Cadastrar Itens\n") // Ao cadastrar, da a opção: Adicionar a sacola? [1] - sim [0] - não
            .concat("[3] - Voltar");

        String divisoria = "----------------------------------";

        while (true) {
            System.out.println(divisoria+"\n"+menuInicial+"\n"+divisoria);
            switch (input.nextInt()) {
                case 1:
                    limparTerminal();
                    System.out.println(divisoria+"\n"+menuItens+"\n"+divisoria); // exibe menuItens
                    int resposta = input.nextInt();// Dá a opção de digitar o ID para adicionar a sacola, ou 0 para voltar
                    if (resposta == 1){
                       System.out.println(""); 
                    //    if (input.nextInt() ==)
                    } else if (resposta == 2) {

                    } else if (resposta == 3) {
                        break;
                    } else {
                        limparTerminal();
                        System.out.println("Opção inválida!");
                        break;
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    //input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }

}

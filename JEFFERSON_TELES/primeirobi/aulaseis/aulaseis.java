package primeirobi.aulaseis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import primeirobi.Cliente;
import primeirobi.Loja;
import primeirobi.Vendedor;

public class aulaseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<pedido> pedidos = new ArrayList<>();
        List<item> itens = new ArrayList<>();

        int opcao;
        do {
            System.out.println("- MENUZINHO -");
            System.out.println("1-ADICIONAR ITEM");
            System.out.println("2-CRIAR PEDIDO");
            System.out.println("3-SAIR");
            System.out.print("ESCOLHA UMA OPCAO:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID DO ITEM:");
                    int idItem = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("NOME DO ITEM:");
                    String nomeItem = scanner.nextLine();
                    System.out.print("TIPO DE ITEM:");
                    String tipoItem = scanner.nextLine();
                    System.out.print("VALOR DO ITEM:");
                    double valorItem = scanner.nextDouble();
                    scanner.nextLine();
                    itens.add(new item(idItem, nomeItem, tipoItem, valorItem));
                    System.out.println("ITEM ADICIONADO.");
                    break;
                case 2:
                    Cliente cliente = new Cliente("JEFF");
                    endereco enderecoLoja = new endereco("PR", "Cascavel", "Centro", "8455500", "FAG");
                    Loja loja = new Loja("Loja A", enderecoLoja);
                    Vendedor vendedor = new Vendedor("Jeff");
                    pedido pedido = new pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itens);
                    pedidos.add(pedido);
                    System.out.println("PEDIDO CRIADO.");
                    itens.clear();
                    break;
                case 3:
                    System.out.println("ENCERRANDO PROGRAMA.");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}

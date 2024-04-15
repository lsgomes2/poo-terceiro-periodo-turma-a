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
            System.out.println("3-TESTAR GERENTE");
            System.out.println("4-CRIAR PEDIDO COM DADOS FAKES");
            System.out.println("5-ADICIONAR PEDIDO FAKE MANUALMENTE");
            System.out.println("6-SAIR");
            System.out.print("ESCOLHA UMA OPCAO:");
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.nextLine();
                opcao = 0;
            }

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
                    criarPedido(pedidos, itens);
                    break;
                case 3:
                    break;
                case 4:
                    criarPedidoDadosFalsos(pedidos);
                    break;
                case 5:
                    adicionarPedidoManualmente(pedidos, scanner);
                    break;
                case 6:
                    System.out.println("ENCERRANDO PROGRAMA.");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA.");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void criarPedido(List<pedido> pedidos, List<item> itens) {
        Cliente cliente = new Cliente("JEFF");
        endereco enderecoLoja = new endereco("PR", "Cascavel", "Centro", "8455500", "FAG");
        Loja loja = new Loja("Loja A", enderecoLoja);
        Vendedor vendedor = new Vendedor("Jeff");
        pedido pedido = new pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itens);
        pedidos.add(pedido);
        System.out.println("PEDIDO CRIADO.");
        itens.clear();
    }

    private static void criarPedidoDadosFalsos(List<pedido> pedidos) {
        Cliente cliente = new Cliente("Maria");
        endereco enderecoLoja = new endereco("PR", "Cascavel", "Centro", "8455500", "FAG");
        Loja loja = new Loja("Loja B", enderecoLoja);
        Vendedor vendedor = new Vendedor("João");
        List<item> itens = new ArrayList<>();
        itens.add(new item(1, "Camisa", "Roupa", 50.0));
        itens.add(new item(2, "Calça", "Roupa", 80.0));
        pedido pedido = new pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itens);
        pedidos.add(pedido);
        System.out.println("PEDIDO COM DADOS FALSOS CRIADO.");
    }

    private static void adicionarPedidoManualmente(List<pedido> pedidos, Scanner scanner) {
        System.out.print("ID DO PEDIDO:");
        int idPedido = scanner.nextInt();
        scanner.nextLine();
        System.out.print("NOME DO CLIENTE:");
        String nomeCliente = scanner.nextLine();
        System.out.print("NOME DO VENDEDOR:");
        String nomeVendedor = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        Vendedor vendedor = new Vendedor(nomeVendedor);
        pedido pedido = new pedido(idPedido, new Date(), cliente, vendedor, null, null);
        pedidos.add(pedido);
        System.out.println("PEDIDO ADICIONADO MANUALMENTE.");
    }
}

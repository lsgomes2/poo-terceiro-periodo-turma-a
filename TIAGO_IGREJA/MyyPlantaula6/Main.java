package MyyPlantaula6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um gerente
        Gerente gerente = new Gerente("Ana", 35, "Loja Central", "Cidade A", "Centro", "Rua Principal", 3000.0);
        gerente.adicionarSalario(3200.0); // Adicionando um novo salário recebido
        gerente.adicionarSalario(3300.0); // Adicionando um novo salário recebido

        // Apresentando o gerente
        System.out.println("=== Gerente ===");
        gerente.apresentarSe();
        System.out.println("Média dos salários recebidos: " + gerente.calcularMedia());
        System.out.println("Bônus: " + gerente.calcularBonus());

        // Criando um cliente
        Endereco enderecoCliente = new Endereco("Estado A", "Cidade B", "Bairro C", "123", "Complemento");
        Cliente cliente = new Cliente("João", 30, enderecoCliente);

        // Criando itens
        Item item1 = new Item(1, "Planta", "Decoração", 50.0);
        Item item2 = new Item(2, "Vaso", "Decoração", 30.0);

        // Criando um pedido
        Item[] itensPedido = { item1, item2 };
        Date dataCriacaoPedido = new Date();
        Pedido pedido = new Pedido(1, dataCriacaoPedido, cliente, gerente, Loja.getInstance(), itensPedido);
        
        // Apresentando o pedido
        System.out.println("\n=== Pedido ===");
        System.out.println(pedido.gerarDescricaoVenda());
    }
}

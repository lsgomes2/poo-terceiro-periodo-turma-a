package primeirobimestre.atividade7;

public class teste {
    
    public static void main(String[] args) {

        // Criar clientes
        Endereco enderecoCliente1 = new Endereco("Paraná", "Cascavel", "Santa Felicidade", "715", "Casa de esquina");
        Endereco enderecoCliente2 = new Endereco("Distrito Federal", "Brasilia", "Cascatinha", "2123", "Sobrado com pé de manguezal na frente.");
        Cliente cliente1 = new Cliente("Raul Kaito", 43, enderecoCliente1);
        Cliente cliente2 = new Cliente("Heitor Massucato", 19, enderecoCliente2);

        // Criar vendedor 
        Endereco enderecoVendedor1 = new Endereco("Paraná", "Cascavel", "Neva", "1231", "Casa azul");
        Float[] salarioRecebidoVend1 = {2400.00f, 1800.00f, 1904.99f};
        Endereco enderecoVendedor2 = new Endereco("Paraná", "Cascavel", "Neva", "41", "Cabana da rocinha");
        Float[] salarioRecebidoVend2 = {1150.50f, 1500.00f, 2000.50f};
        Vendedor vendedor1 = new Vendedor("Pedro Henrique", 19, "MyyPlant",enderecoVendedor1, 1550.00f, salarioRecebidoVend1);
        Vendedor vendedor2 = new Vendedor("Gabriel Toledo", 32, "MyyPlant", enderecoVendedor2, 1500.00f, salarioRecebidoVend2);

        // Criando loja
        Endereco enderecoLoja = new Endereco("Paraná", "Cascavel", "Neva", "44", "Casa azul");
        Cliente[] clientes = {cliente1, cliente2};
        Vendedor[] vendedores = {vendedor1, vendedor2};
        Loja loja = new Loja("MyyPlant", "Plantas Gabriela ltda", "94.027.944/0001-04", enderecoLoja, vendedores, clientes);

        Item item1 = new Item(223, "caneta azul", "caneta", 10f);
        Item[] itens = {item1};
        ProcessaPedido processador = new ProcessaPedido();
        Pedido pedido = processador.processar(cliente1, vendedor1, loja, itens);

    }
}

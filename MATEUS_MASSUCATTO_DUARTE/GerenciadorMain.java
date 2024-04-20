import java.util.Date;

public class GerenciadorMain 
{
    public static void main(String[] args) 
    {
        
        Loja loja = new Loja();

        loja.nomeFantasia = "Arbor";
        loja.razaoSocial = "Myy Plant";
        loja.cnpj = 123456789;
        loja.cidadeL = "Salto do Lontra";
        loja.bairroL = "Fraron";
        loja.ruaL = "Morumbi";
        loja.numeroL = 5612;
        loja.complementoL = "Atras de Majula";

        Vendedor[] vendedores = new Vendedor[2];
        Cliente[] clientes = new Cliente[2];
        Gerente[] gerentes = new Gerente[1];

        //associando os arrays de vendedores e clientes para a loja
        loja.vendedores = vendedores;
        loja.clientes = clientes;
        loja.gerentes = gerentes;

        System.out.println("Quantidade de vendedores na loja: " + loja.contarVendedores());
        System.out.println("Quantidade de clientes na loja: " + loja.contarClientes());
        System.out.println("Quantidae de gerentes na loja: " + loja.contarGerentes());
        loja.apresentarseL();
        System.out.println("---------------------------------------------------");
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Vendedor vendedorUm = new Vendedor();

        vendedorUm.nomeV = "Carlinhos";
        vendedorUm.idadeV = 23;
        vendedorUm.loja = "Arbor";
        vendedorUm.cidadeV = "Salto do Lontra";
        vendedorUm.bairroV = "Limoeiro";
        vendedorUm.ruaV = "Sao Paulo";
        vendedorUm.numeroV = 1363;
        vendedorUm.complementoV = "Shrine of Amana";
        vendedorUm.SalarioBase = 2500;
        vendedorUm.SalarioRecebido = (2500 + 3000 + 2650);
        vendedorUm.apresentarseV();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();
        System.out.println("\n");

        Vendedor vendedorDois = new Vendedor();

        vendedorDois.nomeV = "Clebusglóides";
        vendedorDois.idadeV = 25;
        vendedorDois.loja = "Arbor";
        vendedorDois.cidadeV = "Dois vizinhos";
        vendedorDois.bairroV = "Anor Londo";
        vendedorDois.ruaV = "Juriquaquara";
        vendedorDois.numeroV = 2862;
        vendedorDois.complementoV = "Ao lado da Cripta dos Mortos-Vivos";
        vendedorDois.SalarioBase = 2600;
        vendedorDois.SalarioRecebido = (2600 + 3100 + 2750);
        vendedorDois.apresentarseV();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();
        System.out.println("\n");

        Cliente clienteUm = new Cliente();

        clienteUm.nomeC = "Soclovaldirno";
        clienteUm.idadeC = 43;
        clienteUm.cidadeC = "Majula";
        clienteUm.bairroC = "Ambarino";
        clienteUm.ruaC = "São Denis";
        clienteUm.numeroC = 2862;
        clienteUm.complementoC = "Perto de Iron Keep";
        clienteUm.apresentarseC();
        System.out.println("\n");

        Cliente clienteDois = new Cliente();
        clienteDois.nomeC = "Jin Sakai";
        clienteDois.idadeC = 32;
        clienteDois.cidadeC = "Nova Austin";
        clienteDois.bairroC = "Izuhara";
        clienteDois.ruaC = "Ocha no Mizu";
        clienteDois.numeroC = 9746;
        clienteDois.complementoC = "2 quadras a direita de Things Betwixt";
        clienteDois.apresentarseC();

        Gerente gerenteUm = new Gerente();
        gerenteUm.nomeG = "Nashandra";
        gerenteUm.idadeG = 824;
        gerenteUm.loja = "Arbor";
        gerenteUm.cidadeG = "Doors of Pharos";
        gerenteUm.bairroG = "Kyoto";
        gerenteUm.ruaG = "Lost Sinner";
        gerenteUm.numeroG = 7636;
        gerenteUm.complementoG = "Ap 2 do condominio Brightstone Cove Tseldora";
        gerenteUm.SalarioBase = 5200;
        gerenteUm.SalarioRecebido = (5200 + 5100 + 4950);
        gerenteUm.apresentarseG();
        gerenteUm.calcularMediaG();
        gerenteUm.calcularBonusG();
        System.out.println("\n");
    
    
        //criando e processando um pedido de exemplo
        Pedido pedido = new Pedido();
        pedido.id = 1;
        pedido.dataCriacao = new Date();
        pedido.dataVencimentoReserva = new Date(pedido.dataCriacao.getTime() + 3 * 24 * 60 * 60 * 1000);// 3 dias apos a criacao
        pedido.cliente = clientes[0]; // atribuindo um cliente de exemplo
        pedido.vendedor = vendedores[0]; //"""
        pedido.loja = loja; // atrbuindo a loja

        int quantidadeItens = 1;
        //criar um array de itens com o tamanho especificado
        Item[] itens = new Item[quantidadeItens];

        for(int i = 0; i < quantidadeItens; i++)
        {
            Item item = new Item();
            System.out.println("Item " + (i + 1) + ":");
            item.nome = "Cereal";
            System.out.println(item.nome);
            item.tipo = "Comida";
            System.out.println(item.tipo);
            item.valor = 5;
            System.out.println(item.valor);
            itens[i] = item;
        }
        //associar o array de itens ao pedido
        pedido.itens = itens;

        //processar o pedido
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(pedido);
    }    
}

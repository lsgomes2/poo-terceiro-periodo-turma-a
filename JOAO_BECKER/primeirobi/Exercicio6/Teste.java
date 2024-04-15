package primeirobi.Exercicio6;

public class Teste {
    public static void main(String[] args) {
        //TESTE LOJA
        System.out.println("----------------lOJA----------------");
        Loja lojaUm = new Loja();

        lojaUm.nomeFantasia="roupa e cia";
        lojaUm.rua="7 de setembro";
        lojaUm.bairro="centro";
        lojaUm.cidade="cascavel";
        lojaUm.cnpj="548.762.565/6666-60";
        lojaUm.estado="Paraná";
        lojaUm.numero=2765;
        lojaUm.complemento="Predio";
        lojaUm.apresentarse();
        lojaUm.clientes[2]="jose";
        lojaUm.clientes[9]="Carlos";
        lojaUm.vendedores[15]="marcos";
        lojaUm.contarClientes();
        lojaUm.contarVendedores();

        //TESTE CLIENTE

        System.out.println("--------------CLIENTE---------------");
        Cliente clienteUm = new Cliente();

        clienteUm.idade=25;
        clienteUm.nome="Marcelo";
        clienteUm.apresentarse();

        //TESTE VENDEDOR

        System.out.println("--------------VENDEDOR--------------");
        Vendedor vendedorUm = new Vendedor();

        vendedorUm.nome="Roberto";
        vendedorUm.loja="roupa & CIA";
        vendedorUm.idade=35;
        vendedorUm.salarioBase=1000.00;
        vendedorUm.salarioRecebido[0]=1000.00;
        vendedorUm.salarioRecebido[1]=1200.00;
        vendedorUm.salarioRecebido[2]=1100.00;
        double bonus=vendedorUm.calcularBonus();
        double media=vendedorUm.calcularMedia();
        System.out.println("O bonus de salário é R$"+bonus+", e a media dos salarios é R$"+media);
        vendedorUm.apresentarse();

        //TESTE GERENTE
        
        System.out.println("--------------GERENTE---------------");
        Gerente gerenteUm = new Gerente();

        gerenteUm.nome="Roberto";
        gerenteUm.loja="roupa & CIA";
        gerenteUm.idade=35;
        gerenteUm.salarioBase=1000.00;
        gerenteUm.salarioRecebido[0]=1000.00;
        gerenteUm.salarioRecebido[1]=1200.00;
        gerenteUm.salarioRecebido[2]=1100.00;
        bonus=gerenteUm.calcularBonus();
        media=gerenteUm.calcularMedia();
        System.out.println("O bonus de salário é R$"+bonus+", e a media dos salarios é R$"+media);
        gerenteUm.apresentarse();

        //TESTE ITEM

        System.out.println("----------------ITEM----------------");
        Item itemUm = new Item();

        itemUm.id=0;
        itemUm.nome="Rosa";
        itemUm.tipo="Flor";
        itemUm.valor=19.90;
        itemUm.gerarDescricao();

        //TESTE PEDIDO

        System.out.println("---------------PEDIDO---------------");
        Pedido pedidoUm= new Pedido();
        pedidoUm.id=1;
        pedidoUm.cliente=clienteUm;
        pedidoUm.vendedor=vendedorUm;
        pedidoUm.loja=lojaUm;
        pedidoUm.items[0]=itemUm;
        pedidoUm.gerarDescricaoVenda();

    }
    
}

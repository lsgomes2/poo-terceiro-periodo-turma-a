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

        Vendedor[] vendedores = new Vendedor[2];
        Cliente[] clientes = new Cliente[2];

        //associando os arrays de vendedores e clientes para a loja
        loja.vendedores = vendedores;
        loja.clientes = clientes;

        System.out.println("Quantidade de vendedores na loja: " + loja.contarVendedores());
        System.out.println("Quantidade de clientes na loja: " + loja.contarClientes());
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
        vendedorUm.SalarioBase = 2500;
        vendedorUm.SalarioRecebido = (2500 + 3000 + 2650);
        vendedorUm.apresentarseV();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();
        System.out.println("--");

        Vendedor vendedorDois = new Vendedor();

        vendedorDois.nomeV = "Clebusglóides";
        vendedorDois.idadeV = 25;
        vendedorDois.loja = "Arbor";
        vendedorDois.cidadeV = "Dois vizinhos";
        vendedorDois.bairroV = "Anor Londo";
        vendedorDois.ruaV = "Juriquaquara";
        vendedorDois.SalarioBase = 2600;
        vendedorDois.SalarioRecebido = (2600 + 3100 + 2750);
        vendedorDois.apresentarseV();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();
        System.out.println("--");

        Cliente clienteUm = new Cliente();

        clienteUm.nomeC = "Soclovaldirno";
        clienteUm.idadeC = 43;
        clienteUm.cidadeC = "Majula";
        clienteUm.bairroC = "Ambarino";
        clienteUm.ruaC = "São Denis";
        clienteUm.apresentarseC();
        System.out.println("--");

        Cliente clienteDois = new Cliente();
        clienteDois.nomeC = "Jin Sakai";
        clienteDois.idadeC = 32;
        clienteDois.cidadeC = "Nova Austin";
        clienteDois.bairroC = "Izuhara";
        clienteDois.ruaC = "Ocha no Mizu";
        clienteDois.apresentarseC();
    }
    
}

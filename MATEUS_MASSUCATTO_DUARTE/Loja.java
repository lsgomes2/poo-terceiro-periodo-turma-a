public class Loja 
{
    String nomeFantasia;
    String razaoSocial;
    int cnpj;
    String cidadeL;
    String bairroL;
    String ruaL;
    int numeroL;
    String complementoL;
    Vendedor[] vendedores;
    Cliente[] clientes;
    Gerente[] gerentes;

    public int contarClientes()
    {
        return clientes.length;
    }

    public int contarVendedores()
    {
        return vendedores.length;
    }

    public int contarGerentes()
    {
        return gerentes.length;
    }

    void apresentarseL()
    {
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidadeL + ", " + bairroL + ", " + ruaL);
    }
    
    
   
}

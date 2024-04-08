package HEITOR_FOLTRAN.primeirobi.atividades.lista5;

public class Loja {
    
    String nomeFantasia, razaoSocial, cidade, bairro, rua;
    int [] vendedores;
    int [] clientes;
    int cnpj;

    public Loja (String nomeFantasia, String razaoSocial, String cidade, String bairro, String rua, int [] vendedores, int [] clientes, int cnpj){

        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.vendedores = vendedores;
        this.clientes = clientes;
        this.cnpj = cnpj;
    }

    void apresentarSe(){
        System.out.println("Nome fantasia: " + this.nomeFantasia + "\n CNPJ: " + "\nEndereço: " + this.cnpj);
    }

    public int contarClientes(){
        return this.clientes.length;
    }

    public int contarVendedores(){
        return this.vendedores.length;
    }

}

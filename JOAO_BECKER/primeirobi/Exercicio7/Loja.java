package primeirobi.Exercicio7;

public class Loja {
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String [] vendedores = new String[5];
    private String [] clientes = new String[20];
    private Endereco endereco;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(String[] vendedores) {
        this.vendedores = vendedores;
    }

    public String[] getClientes() {
        return clientes;
    }

    public void setClientes(String[] clientes) {
        this.clientes = clientes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
 
}
